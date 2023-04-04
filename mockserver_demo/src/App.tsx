import React from "react";
import "./App.css";
import { Form } from "./components/Form";

function App() {
  // fetch(
  //   "https://5a1a3f50-9b07-40b2-a17e-00ab9a5b4f8f.mock.pstmn.io/students?id=1"
  // ).then((res)=>{
  //   const result=res.json();
  //   return result;
  // }).then((result)=>{
  //   console.log(result);
  // });

  return <div className="App">
    <Form />
  </div>;
}

export default App;