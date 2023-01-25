import React from 'react'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import BookingsContainer from './BookingsContainer';
import FormContainer from './FormContainer';
import NavBar from '../components/NavBar';

const MainContainer = () => {

  return (
    <Router>
        <NavBar />
        <Routes>
            <Route path="/" element={ <BookingsContainer/> } />
            <Route path="/create" element={ <FormContainer /> } />
        </Routes>
    </Router>
  )
}

export default MainContainer;