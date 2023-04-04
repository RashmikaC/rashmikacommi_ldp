import React, { useState, useRef, useEffect } from "react";

export const MyRefPrevVal = () => {
  const [name, setName] = useState("");
  const prevName=useRef('');
  console.log(prevName.current+"render");
  useEffect(()=>{
      prevName.current=name;
      console.log(prevName.current+"in effect");
  },[name])
  return (
    <>
      <input type="text" value={name} onChange={(e) => setName(e.target.value)}></input>
      <div>My name is {name}, previously it was {prevName.current}</div>
    </>
  );
};
