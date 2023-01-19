import React from 'react';

const Location = ({location, name, capital, languages, currencies, demonyms, onLocationClicked}) => {

    const handleClick = function() {
        onLocationClicked(location)
    }

    return (
        <div className="country" onClick={handleClick}>
            {name}
        </div>
    )
}

export default Location;