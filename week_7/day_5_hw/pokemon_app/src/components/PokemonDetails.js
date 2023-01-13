import React from 'react';
import PokemonAbilities from './PokemonAbilities';

const PokemonDetails = ({selectedPokemon, selectedPokemonDetails}) => {

    const pokeHeight = selectedPokemonDetails.height * 10;
    const pokeWeight = selectedPokemonDetails.weight / 10;

    const capitalizePokeName = (pokeName) => {
        return pokeName.charAt(0).toUpperCase() + pokeName.slice(1)
    }

    const pokemonAbility = selectedPokemonDetails.abilities.map((ability, index) => {
        return <PokemonAbilities key={index} ability={ability} index={index}/>
    })


    return (
        <div className="pokemon-details">
            <h4>No. {selectedPokemonDetails.id}</h4>
            <h2>{capitalizePokeName(selectedPokemon.name)}</h2>
            <img src={selectedPokemonDetails.sprites.front_default} alt={selectedPokemon.name}></img>
            <p>Height: {pokeHeight} cms </p>
            <p>Weight: {pokeWeight} kg</p>
            <h4>Abilities:</h4>
            <li>{pokemonAbility}</li>
        </div>
    )
}


export default PokemonDetails;