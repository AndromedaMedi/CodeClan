import React from "react";

const Song = ({title, position, artist}) => {
    const pos = position += 1;

    return (
        <>
            <li>{pos}</li>
            <li>{title}</li>
            <li>{artist}</li>
        </>
    ) 
}

export default Song;
