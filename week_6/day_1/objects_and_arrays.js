var myArray = [];
var sports = ['football', 'tennis', 'rugby'];

// console.log(sports);
// console.log(sports.length);
// console.log(sports[1]);
// console.log(sports[4]);

sports.push('snooker');
sports.push('curling', 'badminton', 'basketball');
var removeSport = sports.pop();

sports.unshift('hockey', 'golf');


var shiftedSport = sports.shift();
// console.log(sports);


var removedElements = sports.splice(1, 2);
// console.log(removedElements);
// console.log(sports);

// for (var currentSport of sports) {
//     var upperCaseSport = currentSport.toUpperCase();
//     console.log(upperCaseSport);
// }

// i++ equivalent to i = i + 1
for (var i = 0; i < sports.length; i+=2) {
    console.log('counter was: ', i, ' sport was', sports[i]);
}