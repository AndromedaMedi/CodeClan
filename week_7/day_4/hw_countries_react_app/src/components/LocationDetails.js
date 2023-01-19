import React from 'react';

const LocationDetails = ({location}) => {

    console.log(Object.values(location.currencies));

    const currencies = Object.values(location.currencies).map((currency) => {
        return(
            <p>{currency.name}</p>
        )
    })


    return (
        <div className="location-details">
            <h2>{location.name.common}</h2>
            {location.flag}
            <p></p>
            <li>Capital</li>
            <h5>{location.capital}</h5>
            <li>Currency</li>
            <h5>{currencies}</h5>     
        </div>
    )
}

export default LocationDetails;