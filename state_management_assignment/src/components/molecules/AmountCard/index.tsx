import React from "react";
import { Typography, Button } from "@mui/material";
import { ThemeProvider } from "@mui/material/styles";
import { theme } from "../../../themes/AmountCardTheme";
import "./index.css";

interface Props {
  amount: number;
}

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
