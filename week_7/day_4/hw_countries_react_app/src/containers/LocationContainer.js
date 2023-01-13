import React, {useState, useEffect} from 'react';
import LocationList from '../components/LocationList';
import LocationDetails from '../components/LocationDetails';
import LocationSelector from '../components/LocationSelector';


const LocationContainer = () => {
    const [locations, setLocations] = useState([])
    const [selectedLocation, setSelectedLocation] = useState(null);


    useEffect(() => {
        showLocations();
    }, [])
 

    const showLocations = function() {
        fetch('https://restcountries.com/v3.1/all')
        .then(res => res.json())
        .then(locations => {
            locations.sort((locationA, locationB) =>
            locationA.name.common.localeCompare(locationB.name.common))
            
            setLocations(locations)})
    }

    const onLocationClicked = function(location) {
        setSelectedLocation(location);
    }

    const onLocationSelected = function(location) {
        setSelectedLocation(location);
    }




    return (

        <div className="location-container">
            <LocationSelector locations={locations} onLocationSelected={onLocationSelected}/>
            {selectedLocation? <LocationDetails location={selectedLocation}/> : null}
        </div>
    
    )
}

export default LocationContainer;
