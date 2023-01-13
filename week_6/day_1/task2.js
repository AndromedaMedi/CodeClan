// 1. declare a named function that takes an array of numbers 
// as an argument and returns the sum (total) of all the numbers 
// in the array

function sumFunction(array) {
    var total = 0
    for (var num of array) {
        total += num;
    }
    return total;
}
var nums = [1, 2, 3, 4];
console.log(sumFunction(nums));



// 2. write an annonymous function expression that takes
// two arguments:
// - an object
// - a string
// and return true if the string is present as a key in the 
// object otherwise false

var argument = function (string, object) {
    for (var key in object) {
        if (key === string) {
            return true;
        }
    }
    return false;
}

var person =  {
    name: 'Ben',
    color: 'green'
};
var key = 'name'
var wasPresent = argument(key, person)
console.log(wasPresent)