import React from "react";
import { Typography, Button } from "@mui/material";
import { createTheme, ThemeProvider } from "@mui/material/styles";
import "./index.css";

interface Props {
  amount: number;
}

const theme = createTheme({
  palette: {
    primary: {
      main: '#0052FF',
    },
  },
  typography: {
    button: {
      textTransform: "none",
      fontSize: "14px",
      letterSpacing: "0.01em",
    },
  },
});

export const AmountCard = (props: Props) => {
  return (
    <div className="amount">
      <Typography variant="h5">${props.amount}</Typography>
      <ThemeProvider theme={theme}>
        <Button variant="outlined">Buy max</Button>
      </ThemeProvider>
    </div>
  );
};
