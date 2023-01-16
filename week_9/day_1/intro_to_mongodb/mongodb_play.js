use zoo;

// Reading from the db 

const id = ObjectId('63c55c07cd0cd16e13fd56a1');
db.animals.findOne({_id: id})


// Update entry

db.animals.updateOne(
    {_id: ObjectId('63c55c07cd0cd16e13fd56a2')},
    {$set: {name: "Steve"}}
)
db.animals.findOne({_id: ObjectId('63c55c07cd0cd16e13fd56a2')})


// Delete entry

db.animals.deleteOne({_id: ObjectId('63c55c07cd0cd16e13fd56a2')})