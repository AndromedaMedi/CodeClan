// const getEvens = function(numbers) {
//     const evenNums = [];
//     numbers.forEach((number) => {
//         if (number % 2 === 0) {
            
//         }

//         const evenNum = number % 2 === 0;
//         evenNums.push(evenNum);
//     });
//     return evenNums;
// }

const getEvens = function (arrayOfNums) {
    const evenNums = arrayOfNums.filter((number) => {
        return number % 2 === 0;
        // if (number % 2 === 0) {
        //     return true;
        // }else {
        //     return false;
        // }
    });
    return evenNums;
}
// OR //
// const getEvens = function (arrayOfNums) {
//     return arrayOfNums.filter((number) => number %2===0);
// };

const numbers = [1,2,3,4,5,6,7,8]

console.log('Even numbers: ', getEvens(numbers));



const getOdds = function (arrayOfNums) {
    const oddNums = arrayOfNums.filter((number) => {
        return number % 2 !== 0 ;
    })
    return oddNums;
}
console.log('Odd numbers: ', getOdds(numbers));

// OR
