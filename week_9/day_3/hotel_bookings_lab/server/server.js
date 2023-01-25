const express = require('express');
const MongoClient = require('mongodb').MongoClient;
const createRouter = require('./helpers/create_router');
const cors = require('cors');

const app = express();

app.use(express.json());
app.use(cors());

MongoClient.connect('mongodb://127.0.0.1:27017', { useUnifiedTopology: true })
    .then(client => {
        const db = client.db('bookings_data');
        const bookingsCollection = db.collection('bookings');
        const bookingsRouter = createRouter(bookingsCollection)
        app.use('/api/bookings', bookingsRouter)
    })
    .catch(console.error)

app.listen(9000, function () {
    console.log(`Listening on port ${ this.address().port }`);
})