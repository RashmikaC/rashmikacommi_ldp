import React from "react";
import "./App.css";
import { ThemeProvider } from "@mui/material";
import theme from "./theme/theme";
import StakeholdersPage from "./pages/StakeholdersPage";
import CapitalizationPage from "./pages/CapitalizationPage";
import { BrowserRouter, Route, Routes } from "react-router-dom";

function App() {
  return (
    <div data-testid="app">
      <ThemeProvider theme={theme}>
        <BrowserRouter>
          <Routes>
            <Route path="/stakeholders" element={<StakeholdersPage />} />
            <Route path="capitalization" element={<CapitalizationPage />} />
          </Routes>
        </BrowserRouter>
      </ThemeProvider>
    </div>
  );
}

export default App;
