// FUNCTION DECLARATION
function sayHello(greetingName='World') {
    return `Hello ${greetingName}!`;
    // console.log(arguments);
    // return 'Hello!';
}

// FUNCTION EXPRESSION
var add = function addFunction (firstNum, secondNum) {
    return firstNum + secondNum;
}
console.log(add(1, 2));

// ANONYMOUS EXPRESSION
var subtract = function (firstNum, secondNum) {
    return firstNum - secondNum
}

