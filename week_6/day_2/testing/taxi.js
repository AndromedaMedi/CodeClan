const Taxi = function(manufacturer, model, driver) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.driver = driver;
    this.passengers = []
};


Taxi.prototype.numberOfPassengers = function() {
    return this.passengers.length;
};

Taxi.prototype.addPassenger = function(passenger) {
    this.passenger.push(passenger)
};

Taxi.prototype.removerPassengerByName = function(name) {
    const indexOfPassengers = this.passengers.indexOf(name);
    this.passengers.splice(indexOfPassengers, 1);
};

Taxi.prototype.removeAllPassengers = function() {
    this.passengers.splice(0, this.numberOfPassengers())
};

module.exports = Taxi;