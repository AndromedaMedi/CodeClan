import {useState, useEffect} from 'react';
import './App.css';

function App() {

  const [inputNumber, setInputNumber] = useState(1)
  const [answer, setAnswer] = useState('')

  const handleInc = () => {
    let newNum = inputNumber + 1;
    setInputNumber(newNum);
  }

  useEffect(() => {
    if (inputNumber % 3 === 0 && inputNumber % 5 === 0) {
      setAnswer("fizzbuz")
    } else if (inputNumber % 3 === 0) {
      setAnswer("fizz")
    } else if (inputNumber % 5 === 0) {
      setAnswer("buzz")
    } else {
      setAnswer(inputNumber);
    }
  },[inputNumber])


  return (

    <div>
      <h2>{inputNumber}</h2>
      <h2>{answer}</h2>
      <button value={inputNumber} onClick={handleInc}>+</button>
    </div>

  );
}

export default App;
