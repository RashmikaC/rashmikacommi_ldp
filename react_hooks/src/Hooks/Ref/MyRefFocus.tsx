import React, { useState, useRef } from "react";

export const MyRefFocus = () => {
  const [name, setName] = useState("");
  const inputRef = useRef<HTMLInputElement>(null);

  const myFocus = () => {
    if (inputRef.current) {
      inputRef.current.focus();
      // inputRef.current.value = "some name"; u shd never manually set value as it shd be done using state or props
    }
  };

  return (
    <>
      <input
        ref={inputRef}
        type="text"
        value={name}
        onChange={(e) => setName(e.target.value)}
      ></input>
      <div>My name is {name}</div>
      <button onClick={myFocus}>Focus input</button>
    </>
  );
};
