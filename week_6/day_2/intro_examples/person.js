const Person = function(name) {
    this.name = name;
}

Person.prototype.greet = function() {
    console.log(`Hi my name is ${this.name}`);

}

module.exports = Person

// const shaggy = new Person('Shaggy Rogers');
// const velma = new Person('Velma Dinkley')
// shaggy.greet()

// console.log(Object.getPrototypeOf(shaggy)) // SHOWS THE FUNCTIONS INSIDE THE PROTOTYPE
// console.log(Object.getPrototypeOf(velma))

