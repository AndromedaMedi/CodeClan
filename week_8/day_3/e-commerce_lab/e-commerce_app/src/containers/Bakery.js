import {React, useState} from 'react';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Home from '../components/Home';
import NavBar from '../components/NavBar';
import ProductList from '../components/ProductList';
import MyBasket from '../components/MyBasket';


const Bakery = () => {

    const productData = [
        {id: 0, name: "Chocolate Muffin", price: 2},
        {id: 0, name: "Vanilla Cupcake", price: 2.50},
        {id: 0, name: "Chocolate Chip Cookie", price: 1},
        {id: 0, name: "Brownie", price: 1.50},
        {id: 0, name: "Cinnamon Swirl", price: 2.80},
        {id: 0, name: "Butter Croissant", price: 0.90}
    ];

    const userData = [{id: 0, name: "Jim", wallet: 10}]

    const [user, setUser] = useState(userData);
    const [basket, setBasket] = useState([]);

    const addToBasket = (product) => {
        const copyBasket = [...basket, product]
        setBasket(copyBasket)
    };

    // const removeFromBasket = (product) => {
    //     const copySecondBasket = [...basket, product]
    //     setBasket(copySecondBasket)
    // }



    return (

        <>
        <Router>
            <NavBar/>
            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path="/products" element={<ProductList productData={productData} addToBasket={addToBasket}/>}/>
                <Route path="/MyBasket" element={<MyBasket basket={basket}/>}/>
            </Routes>
        </Router>
        </>
    );
};

export default Bakery;

