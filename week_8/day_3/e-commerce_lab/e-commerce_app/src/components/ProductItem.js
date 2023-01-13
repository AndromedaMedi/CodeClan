import React from "react";

const ProductItem = ({product, addToBasket}) => {

    return (
        <>
        <h4>{product.name}</h4>
        <p>£{product.price}</p>
        <button on onClick={() => addToBasket(product)}>Add to basket</button>
        </>
    );
};

export default ProductItem;