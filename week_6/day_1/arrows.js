// FUNCTION DECLARATION (NAMED FUNCTION)
function addFunction(num1, num2) {
    return num1 + num2
}

// FUNCTION EXPRESSION
var addExpression = function (firstNum, secondNum) {
    return firstNum + secondNum
}

// ARROW FUNCTION
var addArrowFunction = (firstNum, secondNum) => firstNum + secondNum;

var result = addArrowFunction(1,2);
console.log(result)