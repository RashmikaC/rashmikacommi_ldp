import React from 'react';
import './App.css';
import { Todo } from './components/FireEventDemo/Todo';
import { Counter } from './components/userEventDemo/counter';
// import { MyApp } from './components/Search/MyApp';
import { MyApp } from './components/User/MyApp';

function App() {
  return (
    <div className="App">
      {/* <MyApp/> */}
      {/* <Todo/> */}
      <Counter />
    </div>
  );
}

export default App;
