import React, { useState, useMemo ,useEffect} from "react";

export const MyMemo = () => {
  const [num, setNum] = useState(0);
  const [dark, setDark] = useState(false);
  // const doubleNumber=slowFunction(num);
  const doubleNumber = useMemo(() => {
    return slowFunction(num);
  }, [num]);
//   const themeStyles = {
//     backgroundColor: dark ? "black" : "white",
//     color: dark ? "white" : "black",
//   };

const themeStyles = useMemo(()=>{
  return {
    backgroundColor: dark ? "black" : "white",
    color: dark ? "white" : "black",
}},[dark]);

useEffect(()=>{
    console.log("theme changed")
},[themeStyles])

  return (
    <>
      <input
        type="number"
        value={num}
        onChange={(e) => setNum(parseInt(e.target.value))}
      />
      <button onClick={() => setDark((prevDark) => !prevDark)}>
        Change Theme
      </button>
      <div style={themeStyles}>{doubleNumber}</div>
    </>
  );
};

const slowFunction = (num: number) => {
  for (let i = 0; i < 100000000; i++) {}
  return num * 2;
};
