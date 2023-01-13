

// for (const number of myNumbers) {
//     console.log(`Number was: ${number}`);
// }

// myNumbers.forEach((number) => {
//     console.log(`Number was: ${number}`);
// });

// const myNumberFunction = (number) => {
//     console.log(`Number was: ${number}`);
// }

// myNumbers.forEach(myNumberFunction);

// myNumbers.forEach((number, index) => {
//     console.log(`Next number was: ${number} at index ${index}`);
// });

// const myNumberFunction = (number, index) => {
//     console.log(`Next number was: ${number} at index ${index}`);
// }
// myNumbers.forEach(myNumberFunction);

const myNumbers = [1, 2, 3, 4];

const multiplyByTwo = function(numbers) {
    const multipliedNums = [];
    numbers.forEach((number) => {
        const multipliedNum = number * 2;
        multipliedNums.push(multipliedNum);
    });
    return multipliedNums;
}

console.log(`Numbers after multiplication: `, multiplyByTwo(myNumbers));

// write a function called 'getEvens' that accepts an array of numbers
// and returns a new array of numbers just with the even numbers from that array 
// this should use forEach
// to check if number is even, `if number % 2 === 0`

const getEvens = function(numbers) {
    const evenNums = [];
    numbers.forEach((number) => {
        if (number % 2 === 0) {
            
        }

        const evenNum = number % 2 === 0;
        evenNums.push(evenNum);
    });
    return evenNums
}
console.log(`Even numbers: `, getEvens(myNumbers));