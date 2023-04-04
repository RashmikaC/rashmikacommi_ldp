import React, { useReducer, createContext } from "react";
import ComponentA from "./ComponentA";
import ComponentB from "./ComponentB";
import ComponentC from "./ComponentC";

const initialState = 0;
const reducer = (state: number, action: any) => {
  switch (action) {
    case "increment":
      return state + 1;
    case "decrement":
      return state - 1;
    case "reset":
      return initialState;
    default:
      return state;
  }
};

type InitialStateType = {
  countState: number;
  countDispatch: any;
};

const myInitialState = {
  countState: 0,
  countDispatch: "",
};

export const CountContext = createContext<InitialStateType>(myInitialState);

function Reducer_with_context() {
  const [count, dispatch] = useReducer(reducer, initialState);
  return (
    <CountContext.Provider
      value={{ countState: count, countDispatch: dispatch }}
    >
      Count-{count}
      <ComponentA />
      <ComponentB />
      <ComponentC />
    </CountContext.Provider>
  );
}

export default Reducer_with_context;
