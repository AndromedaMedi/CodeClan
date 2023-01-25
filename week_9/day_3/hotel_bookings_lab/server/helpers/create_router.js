const express = require('express');
const ObjectID = require('mongodb').ObjectID;

const createRouter = function (collection) {

    const router = express.Router();

    // show all bookings (GET)
    router.get('/', (req, res) => {
        collection
            .find()
            .toArray()
            .then((bookings) => res.json(bookings))
            .catch((err => {
                console.error(err);
                res.status(500);
                res.json({ status: 500, error: err });
            }))
    })

    // find one booking (GET)
    router.get('/:id', (req, res) => {
        const id = req.params.id
        collection
            .findOne({_id: ObjectID(id)})
            .then((booking) => res.json(booking))
            .catch((err => {
                console.error(err);
                res.status(500);
                res.json({ status: 500, error: err });
            }))
    })

    // delete booking (DELETE)
    router.delete('/:id', (req, res) => {
        const id = req.params.id
        collection
            .deleteOne({ _id: ObjectID(id) })
            .then((result) => res.json(result))
            .catch(err => {
                console.error(err);
                res.status(500);
                res.json({ status: 500, error: err });
            });
    });

    // create booking (POST)
    router.post('/', (req, res) => {
        const newBooking = req.body;
        collection
            .insertOne(newBooking)
            .then((result) => {
                res.json(result.ops[0])
            })
            .catch((err => {
                console.error(err);
                res.status(500);
                res.json({ status: 500, error: err });
            }))
    })

    // update booking (PUT)
    router.put('/:id', (req, res) => {
        const updatedBooking = req.body;
        const id =req.params.id;
        collection
            .updateOne({ _id: ObjectID(id)}, {$set: updatedBooking})
            .then((bookings) => res.json(bookings))
            .catch((err => {
                console.error(err);
                res.status(500);
                res.json({ status: 500, error: err });
            }))
    })


    return router;
}

module.exports = createRouter;