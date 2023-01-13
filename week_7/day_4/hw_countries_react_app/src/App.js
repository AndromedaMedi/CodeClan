import React from 'react';
import LocationContainer from './containers/LocationContainer';
import './App.css';

function App() {
  return (
    <div className="App">
        <h1>Counties Around the World</h1>
        <h4>Select country for more information:</h4>
        <LocationContainer/>
    </div>
  );
}

export default App;
