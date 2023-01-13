import React from 'react'
const CountryDetail = ({country}) => {

    return (
        <div className="country-detail">
            The Capital of {country.name.common} is {country.capital}
        </div>
    )
}

export default CountryDetail;