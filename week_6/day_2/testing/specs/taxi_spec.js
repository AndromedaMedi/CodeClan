const assert = require('assert');
const Taxi = require('../taxi.js');

describe('Taxi', function() {
    let taxi; // this scopes 'taxi' within the specific 'descibe' block, rather than polute other descibe blocks

    beforeEach(function() {
        taxi = new Taxi('Toyota', 'Prius', 'Jane');
    });

    it('should have a manufacturer', function() {
        const actual = taxi.manufacturer;
        assert.strictEqual(actual, 'Toyota')
    });

    it('should have a model', function() {
        const actual = taxi.model;
        assert.strictEqual(actual, 'Prius')
    });

    it('should have a driver', function() {
        const actual = taxi.driver;
        assert.strictEqual(actual, 'Jane')
    })


    describe('passengers', function() {
        it('should start with no passengers', function() {
            const actual = taxi.passengers;
            assert.deepStrictEqual(actual, []);
        });

        it('should show number of passengers', function() {
            const actual = taxi.numberOfPassengers();
            assert.deepStrictEqual(actual, 0);
        });

        it('should be able to add passengers', function() {
            taxi.addPassenger ('Mike');
            const actual = taxi.passenegrsTotal();
            assert.deepStrictEqual(actual, 1);
        });

        it('should be able to remove passenger by name', function() {
            taxi.addPassenger('Mike');
            taxi.addPassenger('Dierdre');
            taxi.removePassengerByName('Mike');
            const expected = ['Dierdre'];
            const actual = taxi.passengers;
            assert.deepStrictEqual(actual, expected);
        });

        xit('should be able to remove all passengers', function() {
            taxi.addPassenger('Mike');
            taxi.addPassenger('Dierdre');
            taxi.removeAllPassengers();
            const actual = taxi.numberOfPassengers();
            assert.strictEqual(actual, 0);
        });

    })


});
