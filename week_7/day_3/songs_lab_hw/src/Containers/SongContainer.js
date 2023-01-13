import React, {useEffect, useState} from 'react';
import SongList from '../Components/SongList'



const SongContainer = () => {
    const [songs, setSongs] = useState([]);

    useEffect(() => {
        getSongs();
    }, [])

    const getSongs = function() {
        fetch('https://itunes.apple.com/gb/rss/topsongs/limit=20/json')
        .then(result => result.json())
        .then(songs => setSongs(songs.feed.entry[0]))
    }


    return(
        <div className="song-container">
            <SongList songs={songs}/>
        </div>

    )


}


export default SongContainer;