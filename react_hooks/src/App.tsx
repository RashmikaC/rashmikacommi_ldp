import React from 'react';
import './App.css';
import { MyState } from './Hooks/State/MyState';
import { MyEffect } from './Hooks/Effect/MyEffect';
import { MyEffect2 } from './Hooks/Effect/MyEffect2';
import { MyMemo } from './Hooks/Memo/MyMemo';
import { MyRef } from './Hooks/Ref/MyRef';
import { MyRefFocus } from './Hooks/Ref/MyRefFocus';
import {MyRefPrevVal} from './Hooks/Ref/MyRefPrevVal';
import { MyCallback } from './Hooks/Callback/MyCallback';
import { MyContext } from './Hooks/Context/MyContext';
// import CounterOne from './Hooks/Reducer/CounterOne';
// import CounterTwo from './Hooks/Reducer/CounterTwo';
import CounterThree from './Hooks/Reducer/CounterThree';
import Reducer_with_context from './Hooks/useReducer_with_useContext/Reducer_with_context';
import { DocTitleOne } from './Hooks/Custom_hooks/DocumentTitleHook/DocTitleOne';
import { DocTitleTwo } from './Hooks/Custom_hooks/DocumentTitleHook/DocTitleTwo';
import CounterOne from './Hooks/Custom_hooks/CounterHook/CounterOne';
import CounterTwo from './Hooks/Custom_hooks/CounterHook/CounterTwo';

function App() {
  return (
    <div>
      {/* <MyState /> */}
      {/* <MyEffect /> */}
      {/* <MyEffect2 /> */}
      {/* <MyMemo /> */}
      {/* <MyRef /> */}
      {/* <MyRefFocus /> */}
      {/* <MyRefPrevVal /> */}
      {/* <MyCallback /> */}
      {/* <MyContext /> */}
      {/* <CounterOne /> */}
      {/* <CounterTwo /> */}
      {/* <CounterThree /> */}
      {/* <Reducer_with_context /> */}
      {/* <DocTitleOne />
      <DocTitleTwo /> */}
      <CounterOne />
      <CounterTwo />
    </div>
  );
}

export default App;
