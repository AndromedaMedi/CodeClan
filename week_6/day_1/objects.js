var movie = {
    title: "It's a wonderful life",
    year: 1946,
    language: 'Spanish'
};
movie.cast = ['James Stewart', 'Donna Reed'];
movie['subtitle-language'] = 'French';
var keyName = 'cast';

console.log(movie[keyName]);

delete movie['subtitle-language'];
console.log(movie);

movie.ratings = {
    critic: 94,
    audience: 95
}

console.log(movie.ratings.critic);

for (var key in movie) {
    console.log('key was: ', key, ' value was: ', movie[key]); // slightly better, shows everything
    console.log(`key was: ${key}, value was: ${movie[key]}`) // more readable, doesn't give nesting values
}

var movieKeys = Object.keys(movie);
console.log(movieKeys);
