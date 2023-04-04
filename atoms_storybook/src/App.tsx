import React from "react";
import "./App.css";
import { Input } from "./components/atoms/Input/Input";
import { Typography } from "./components/atoms/Typography/Typography";
import { Button } from "./components/atoms/Button/Button";

function App() {
  return (
    <div className="App">
      <Typography variant= 'loginHeader'content='Login to Minet' />
      <br></br>
      <br></br>
      <Typography variant= 'subheader'content='Email' />
      <Input type="email" variant="email" placeholder="you@company.com" />
      <br></br>
      <Typography variant= 'subheader'content='Password' />
      <Input type="password" variant="password" placeholder="Enter Password" />
      <br></br>
      <Typography variant='blueText' content='Forgot Password' />
      <br></br>
      <Button variant="signIn" name="Sign In" />
    </div>
  );
}

export default App;
