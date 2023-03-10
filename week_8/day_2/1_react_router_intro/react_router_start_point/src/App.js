import {React, useState} from "react";
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import About from "./components/About";
import Home from "./components/Home";
import Pricing from "./components/Pricing";
import NavBar from "./components/Navbar";
import Products from "./components/Products";
import ErrorPage from "./components/ErrorPage";
import Choice from "./components/Choice";


const App = ()=> {
  const pricingData = [
    {level: "Hobby", cost: 0},
    {level: "StartUp", cost: 10},
    {level: "Enterprise", cost: 100},
  ];

  const [prices, setPrices] = useState(pricingData);

  
  return (
    <Router>
      <NavBar/>
      <Routes>
        <Route path="/" element={ <Home /> } />
        <Route path="/about" element={ <About /> } />
        <Route path="/pricing" element={ <Pricing prices={prices} /> } />
        <Route path="/products" element={ <Products /> } />
        <Route path="*" element={ <ErrorPage /> } />
        <Route path="/choices/:choice" element={ <Choice /> } />
      </Routes>
    </Router>  
  )

}

export default App;
