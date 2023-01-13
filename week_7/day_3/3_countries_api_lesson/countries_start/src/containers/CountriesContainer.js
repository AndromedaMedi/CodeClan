import React, { useState, useEffect } from 'react';
import CountryList from '../components/CountryList';
import CountryDetail from '../components/CountryDetails';
import CountrySelector from '../components/CountrySelector';
import './CountriesContainer.css';

const CountryContainer = () => {
    const [countries, setCountries] = useState([]);
    const [selectedCountry, setSelectedCountry] = useState(null);

    useEffect(() => {
      getCountries();
    }, [])

    const onCountryClicked = function(country) { // this is not an arrow function because we're passing it to the child (to be called) component but we want it to be executed here at the parent 
        setSelectedCountry(country)
    }

    // const getCountries = function(){
    //     fetch('https://restcountries.com/v3.1/all')
    //     .then(res => res.json())
    //     .then(countries => setCountries(countries))
    // }

    const getCountries = function(){
        fetch('https://restcountries.com/v3.1/all')
        .then(res => res.json())
        .then(countries => { 
            countries.sort((countryA, countryB) => countryA.name.common.localeCompare(countryB.name.common))
            setCountries(countries)})
    }

    return (
        <div className="main-container">
            {/* <CountryList countries={countries} onCountryClicked={onCountryClicked}/> */}
            <CountrySelector countries={countries} onCountrySelected={onCountryClicked}/>
            {selectedCountry? <CountryDetail country={selectedCountry}/> : null} 
        </div> // the function CountryDetails only renders when a country has been selected
    )
}

export default CountryContainer;
