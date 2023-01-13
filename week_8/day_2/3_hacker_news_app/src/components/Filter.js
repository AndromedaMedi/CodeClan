import {React, useState, useEffect} from 'react';

const Filter = ({filterNews}) => {
    const [searchInput, setquery] = useState('')

     const onChange = (event) => {
        setquery(event.target.value)
     }

    useEffect(() => {
        filterNews(searchInput)
    }, [searchInput]) 


    return (
        <input placeholder="Start typing to filter stories..." type='search' value={searchInput} onChange={onChange} />
    )

}

export default Filter;
