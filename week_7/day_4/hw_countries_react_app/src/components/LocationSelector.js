import React from 'react';
import OptionLocation from './OptionLocation';

const LocationSelector = ({locations, onLocationSelected}) => {

    const handleChange = function(event) {
        const chosenLocation = locations[event.target.value];
        onLocationSelected(chosenLocation);
    }

    const locationOptions = locations.map((location, index) => {
        return <OptionLocation key={index} location={location} index={index}/>
    })




    return (
        <select defaultValue="" onChange={handleChange}>
            <option value="" selected>Pick a Country</option>
            {locationOptions}
        </select>
    )
}

export default LocationSelector;