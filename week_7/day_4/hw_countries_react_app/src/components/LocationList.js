import React from 'react';
import Location from './Location';

const LocationList = ({locations, onLocationClicked}) => {

    const locationItems = locations.map((location, index) => {
        return <Location 
            location={location}
            key={index +1}
            name={location.name.common}
            capital={location.capital}
            flag={location.flag}
            onLocationClicked={onLocationClicked}/>
    })


    return (
        <>
        <ul>
            {locationItems}
        </ul>      
        </>
    )
}

export default LocationList;