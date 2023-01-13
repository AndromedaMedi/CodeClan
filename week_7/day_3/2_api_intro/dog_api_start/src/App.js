import {useEffect, useState} from "react";
import './App.css';

function App() {

    const [dogImgUrl, setDogImgUrl] = useState("");

  const fetchDog = function(){
    fetch("https://dog.ceo/api/breeds/image/random") // fetch returns a promise
    .then(response => response.json()) // we can call a .then on that promise, which returns another promise by converting from json
    .then(data => setDogImgUrl(data.message)) // using that second promise (after converting) we call another .then and on that final result promise we setState
  }

  useEffect(() => {
    fetchDog()
  }, [])

  return (
    <div id="app">
    <h1>RANDOGMISER</h1>
    <img id="dog-img" src={dogImgUrl} />
    <button onClick={fetchDog}>Gimme those dogs!</button>
    </div>
  );
}

export default App;
