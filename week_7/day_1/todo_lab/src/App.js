import './App.css';
import React, {useState} from 'react';

function App() {
  const [tasks, setTasks] = useState([
    {name: "Do shopping", priority: "high"},
    {name: "Make dinner", priority: "high"},
    {name: "Clean storage", priority: "low"},
    {name: "Change bedsheets", priority: "low"}
  ])

  const [newTask, setNewTask] = useState("");
  const [newPriority, setPriority] = useState("");


  const taskNodes = tasks.map((task, index) => {
    return <li key={index} className={task.priority === "high" ? "high" : "low"}>
            <span>{task.name}</span>
            {task.priority === "high" ? <span className="high"></span> : <span className="low"></span>}
           </li>
  })

  const handleTaskInput = (event) => {
    setNewTask (event.target.value)
  }
  const handlePriorityChange = (event) => {
    setPriority (event.target.value)
  }

  const saveNewTask = (event) => {
    event.preventDefault();
    const copyTasks = [...tasks];
    copyTasks.push({name: newTask, priority: newPriority});
    setTasks(copyTasks);
    setNewTask("")
  }


  return (
    <div className="App">

      <h1>ToDo's List</h1>

      <form onSubmit={saveNewTask}>
        <label htmlFor="new-task">Add new task:</label>
        <input id="new-task" type="text" value={newTask} onChange={handleTaskInput}/>
        <label>High</label>
        <input name="priority" id="high-priority" type="radio" value="high" onChange={handlePriorityChange}/>
        <label>Low</label>
        <input name="priority" id="low-priority" type="radio" value="low" onChange={handlePriorityChange}/>
        <input type="submit" values="Save New Task"/> 
      </form>

      <ul>
        {taskNodes}
      </ul>

    </div>
  );
}

export default App;
