import React from 'react';
import './App.css';
import ClassClick from './components/event_handling/ClassClick';
import EventBind from './components/event_handling/EventBind';
import { EventPropagation } from './components/event_handling/EventPropagation';
import { FunctionClick } from './components/event_handling/FunctionClick';
// import Toolbar from './components/event_handling/PassingEventHandlersAsProps/Toolbar';
import { ReadingPropsInEventHandlers } from './components/event_handling/ReadingPropsInEventHandlers/ReadingPropsInEventHandlers';
import { Toolbar } from './components/event_handling/StoppingPropagation/Toolbar';
import Form from './components/form_handling/Form';

function App() {
  return (
    <div className="App">
      {/* <FunctionClick />
      <ClassClick /> */}
      {/* <EventBind /> */}
      {/* <ReadingPropsInEventHandlers /> */}
      {/* <Toolbar /> */}
      {/* <EventPropagation /> */}
      {/* <Toolbar /> */}
      <Form />
    </div>
  );
}

export default App;
