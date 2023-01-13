import React from 'react';
import SinglePokemon from './SinglePokemon';

const PokemonList = ({allPokemon, onPokemonClicked}) => {

    const pokemonEntry = allPokemon.map((pokemon, index) => {
        return <SinglePokemon
        pokemon ={pokemon}
        key={index +1}
        name={pokemon.name}
        onPokemonClicked={onPokemonClicked}/>
    })

    return (
        <>
        <ul>
            {pokemonEntry}
        </ul>
        </>
    )
}

export default PokemonList;