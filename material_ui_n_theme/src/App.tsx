import React from "react";
import "./App.css";
import { MuiButton } from "./components/MuiButton";
import { MuiTypography } from "./components/MuiTypography";
import { MuiLink } from "./components/MuiLink";
import { MuiTextField } from "./components/MuiTextField";
import { MuiSelect } from "./components/MuiSelect";
import { MuiLayout } from "./components/MuiLayout";

// import { createMuiTheme } from "@mui/material";
import {createTheme} from '@mui/material/styles';
import { ThemeProvider } from "@mui/system";
import { purple } from "@mui/material/colors";
import { CssBaseline } from "@mui/material";

const theme= createTheme({
  palette:{
    primary:{
      main: '#abcdef'
    },
    secondary: purple,
    mode: 'dark'
  }, 
  typography:{
    fontFamily:'algerian',
    fontWeightMedium:800
  },
  
});

function App() {
  return (
    <>
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <MuiTypography />
      <MuiButton />
      {/* <MuiLink />
      <MuiTextField />
      <MuiSelect />
      <MuiLayout /> */}
    </ThemeProvider>
    </>
  );
}

export default App;
