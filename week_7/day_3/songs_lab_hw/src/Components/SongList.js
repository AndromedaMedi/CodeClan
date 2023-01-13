import React from 'react';
import Song from './Song';


const SongList = ({songs}) => {

    const songNodes = songs.map((song, index) => {
        return <Song 
        title={song['im:name'].label} 
        position={index}
        artist={song['im:artist'].label}
        key={index}/>
        
    })
    

    return (
        <>
            {songNodes}
        </>
    )
}

export default SongList;