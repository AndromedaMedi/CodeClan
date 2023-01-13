import React from "react";
import PokemonOption from "./PokemonOption";

const PokemonSelector = ({allPokemon, onPokemonSelected}) => {

    const handleChange = function(event) {
        const chosenPokemon = allPokemon[event.target.value]
        onPokemonSelected(chosenPokemon);
    }

    const pokemonOptions = allPokemon.map((pokemon, index) => {
        return <PokemonOption
        key={index}
        pokemon={pokemon}
        index={index}
        value={index}/>
    })
    

    return (
        <select defaultValue="" onChange={handleChange}>
            <option value="" slected>Pick a pokemon</option>
            {pokemonOptions}
        </select>
    )
}

export default PokemonSelector;