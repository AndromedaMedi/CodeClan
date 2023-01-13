import React from 'react';



const PokemonAbilities = ({ability, index}) => {

    return <li value={index}>{ability.ability.name}</li>
    }

    export default PokemonAbilities;