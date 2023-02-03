import React from "react";
import { Typography } from "@mui/material";
import "./index.css";

interface Props {
    value: number;
  }  

export const BTCCard = (props:Props) => {
  return (
    <div className="value">
      <Typography variant="h5">{props.value}</Typography>
      <span id='BTC'>BTC</span>
    </div>
  )
}

