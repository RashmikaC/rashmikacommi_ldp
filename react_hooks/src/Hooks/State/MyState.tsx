import React, { useState } from "react";
function initialVal(){
  console.log("run function");
  return 5;
}
export const MyState = () => {
  // const [count, setCount] = useState(initialVal);//initialVal()=>everytime
  // const decrementCount = (): void => {
  //   // setCount(count-1);
  //   // setCount(count-1);
  //   setCount((prevCount) => prevCount - 1);
  //   setCount((prevCount) => prevCount - 1);
  // };
  // const incrementCount = (): void => {
  //   setCount((prevCount) => prevCount + 1);
  // };

  const [state,setState]=useState({count:5,theme:"blue"})
   const decrementCount = (): void => {
    setState(prevState=>{
      return {...prevState,count:prevState.count-1}
    })
   }
   const incrementCount = (): void => {}
  return (
    <div>
      <button onClick={decrementCount}>-</button>
      <span>{state.count}</span>
      <span>{state.theme}</span>
      <button onClick={incrementCount}>+</button>
    </div>
  );
};

// ()=>{
//   console.log("run function");
//   return 5;
// }