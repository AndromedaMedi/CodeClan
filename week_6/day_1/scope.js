var secretsFunction = function() {
    var pinCode = [0, 0, 0, 0];
    // console.log('pin code inside function', pinCode);
}

secretsFunction();
// console.log(pinCode);

// var filterNamesByFirstLetter = function (names, letter) {
//     var filteredNames = [];
//     for (var name of names) {
//         if (name[0] === letter) {
//             filteredNames.push(name);
//         }
//     }
//     console.log('name is now: ', name);
//     return filteredNames;
// }

// var students = ['Alice', 'Bob', 'Arthur', 'Jane'];
// var filteredStudents = filterNamesByFirstLetter(students, 'A');

// console.log(filteredStudents);


let isItFive = function (number) {
    let result;

    if (number === 5) {
        result = true;
    } else {
        result = false;
    }
    return result; 
}