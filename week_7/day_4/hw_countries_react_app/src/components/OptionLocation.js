import React from "react";

const OptionLocation = ({index, location}) => {
    return <option value={index}>{location.name.common}</option>
}

export default OptionLocation;