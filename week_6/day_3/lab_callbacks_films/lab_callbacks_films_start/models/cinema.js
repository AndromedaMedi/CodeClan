const Cinema = function (films) {
  this.films = films;
};

Cinema.prototype.getListOfFilmTitles = function() {
  const listOfFilmTitles = this.films.map((film) => {
    return film.title;
  })
  return listOfFilmTitles;
};

Cinema.prototype.getFilmByTitle = function(filmTitle) {
  const filmByTitle = this.films.find((film) => {
    return film.title === filmTitle
  })
  return filmByTitle
};

Cinema.prototype.getFilmByGenre = function(genre) {
  const filmByGenre = this.films.filter((film) => {
    return film.genre === genre
  })
  return filmByGenre
};

Cinema.prototype.checkFilmsForYear = function(year) {
  const filmsInYear = this.films.some((film) => {
    return film.year == year
  })
  return filmsInYear
};

Cinema.prototype.checkFilmsLength = function(length) {
  const filmsLengthOver = this.films.filter((film) => {
    return film.length > length
  })
  return filmsLengthOver
}

// Cinema.prototype.totalRunningTime = function() {
//   return this.films.reduce((total, film) => {
//     return total = film.length;
//   }, 0);
// };

module.exports = Cinema;
