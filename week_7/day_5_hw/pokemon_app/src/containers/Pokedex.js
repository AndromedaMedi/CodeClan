import React, {useState, useEffect} from 'react';
import PokemonDetails from '../components/PokemonDetails';
import PokemonSelector from '../components/PokemonSelector';


const Pokedex = () => {
    const [allPokemon, setAllPokemon] = useState([])
    const [selectedPokemon, setSelectedPokemon] = useState(null)
    const [selectedPokemonDetails, setSelectedPokemonDetails]= useState(null)

    useEffect(() => {
        showPokemon();
    }, [])

    useEffect(() => {
        if(selectedPokemon){
            showSinglePokemon();
        }
    }, [selectedPokemon])


    const showPokemon = function() {
        fetch('https://pokeapi.co/api/v2/pokemon?limit=151')
        .then(res => res.json())
        .then(data => setAllPokemon(data.results))
    }

    const showSinglePokemon = function() {
        fetch(selectedPokemon.url)
        .then(res => res.json())
        .then(data => setSelectedPokemonDetails(data))
    }

    const onPokemonSelected = function(pokemon) {
        setSelectedPokemon(pokemon);
    }







    return (

        <>
        <h1>My Pokedex!</h1>


        <div className="pokedex">
            <PokemonSelector allPokemon={allPokemon} onPokemonSelected={onPokemonSelected}/>
            {selectedPokemonDetails? <PokemonDetails selectedPokemon={selectedPokemon} selectedPokemonDetails={selectedPokemonDetails}/> : null}
        </div>

        </>

    )
}

export default Pokedex;