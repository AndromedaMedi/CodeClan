import React from 'react';

const Pokemon = ({pokemon, name, onPokemonClicked}) => {

    const handleClick = function() {
        onPokemonClicked(pokemon)
    }

    return (
        <div className="single-pokemon"
            onClick={handleClick}>
                {name}
        </div>
    )
}

export default Pokemon;