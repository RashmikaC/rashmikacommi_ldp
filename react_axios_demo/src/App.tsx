import React from 'react';
import './App.css';
import { PersonList } from './components/PersonList';
import { PersonAdd } from './components/PersonAdd';
import { PersonRemove } from './components/PersonRemove';
import { PersonRemoveAsyncAwait } from './components/PersonRemoveAsyncAwait';

function App() {
  return (
    <div>
      <PersonAdd />
      <PersonList />
      <PersonRemove />
      <PersonRemoveAsyncAwait />
    </div>
  );
}

export default App;
