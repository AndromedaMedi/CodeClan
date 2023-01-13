import React from "react";
import ProductList from "./ProductList";
import ProductItem from "./ProductItem";

const MyBasket = ({basket}) => {
    const baksetEntries = basket.map((product, index) => {
        return (
            <ul>
                <li key={index}>{product.name}</li>
                
            </ul>
        )
    });


    // const runningTotal = (baksetEntries) => {
    //     const totalAmount = basket.sum((baksetEntries) => {
    //         return <li>{totalAmount}</li>
    //     });

    // };

    const removeProduct = (productToRemove) => {
    }

    return (
        <>
        <div className="basket">
            <h3>My Basket</h3>
            <ul>
                {baksetEntries}
            </ul>
        </div>
        <div>
            <h4>Total: </h4>
        </div>
        </>
    );
};

export default MyBasket;