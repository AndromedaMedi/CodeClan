const names = ["Fred", "Kate", "Cindy", "Ricky", "Keith"];
console.log(names);

// const fred = names[0];
// const kate = names[1];

// console.log(kate);

// const [fred, kate] = names;
// console.log(kate);


// const [fred, kate, , ricky] = names;

// console.log(kate);

const [fred, kate, ...remainingNames] = names;

console.log(remainingNames);

const person = {
    name: "Joni",
    age: 76
}
// const name = person.name;
// const age = person["age"];

const {name, age} = person;

console.log(name);
console.log(age);

