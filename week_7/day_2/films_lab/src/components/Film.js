import React from 'react';
 const Film = ({ name, url, children }) => {
    return (
        <>
            <a href={url}><h4>{name}</h4></a>

        </>
    )
 }

 export default Film;