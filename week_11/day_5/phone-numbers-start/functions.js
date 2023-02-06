function createPhoneNumber(numbers) {
    // Please complete the function in order to satisfy the tests
    let result = "";
    numbers = numbers.map(String);
    result += `(${numbers[0] + numbers[1] + numbers[2]}) `;
    result += `${numbers[3] + numbers[4] + numbers[5]}-`;
    result += numbers[6] + numbers[7] + numbers[8] + numbers[9];
    
    return result;
}

module.exports = createPhoneNumber;