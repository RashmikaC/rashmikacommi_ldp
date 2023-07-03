import React from "react";
import "./App.css";
import CandidateTable from "./components/organisms/CandidateTable";
import { BrowserRouter, Route, Routes } from "react-router-dom";

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<CandidateTable />}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
