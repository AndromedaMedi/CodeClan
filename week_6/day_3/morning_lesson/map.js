const myNumbers = [1, 2, 3, 4];

// const multiplyByTwo = function(numbers) {
//     const multipliedNums = [];
//     numbers.forEach((number) => {
//         const multipliedNum = number * 2;
//         multipliedNums.push(multipliedNum);
//     });
//     return multipliedNums;
// }

// USING MAP BECOMES:

const multipliedByTwo = function (arrayOfNums) {
    const multipliedNums = arrayOfNums.map((number) => {
        return number * 2;
    });
    return multipliedNums
}


console.log('Multiplied nums: ', multipliedByTwo(myNumbers));