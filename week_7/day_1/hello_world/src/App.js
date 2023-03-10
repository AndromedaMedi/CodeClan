import './App.css';
import {useState} from 'react'

const greeting = "Hello World"

function App() {

  const [greeting, setGreeting] = useState("Hello World");
  const [total, setTotal] = useState(0);

  const handleClick = (name) => {
    setGreeting("Hello " + name)
  }

  const deposit = () => {
    setTotal(total + 10);
  }

  const withdraw = () => {
    setTotal(total - 10);
  }

  return (
    <>
    <h1>{greeting}</h1>
    <button onClick={() => handleClick("Steve")}>Change Greeting</button>
    <p>Total: £{total}</p>
    <button onClick={deposit}>Deposit</button>
    <button onClick={withdraw}>Withdraw</button>
    </>
  );
}

export default App;
