import React from "react";
import { Slider } from "@mui/material";
import "./index.css";

export const BTSlider = (props: any) => {
  const mark = [
    {
      value: 0.023451,
      label: "1BTC = $3,406,069.54",
    },
  ];
  const handleChange=(e: any,val: any)=>
  {
    // console.log(val);
    props.onChange(val);
  }
  return (
    <div id="slider">
      <Slider
        min={0}
        max={0.05}
        defaultValue={0.023451}
        marks={mark}
        step={0.000001}
        size="small"
        orientation="vertical"
        onChange={handleChange}
        sx={{
          color: 'grey.500',
        }}
      />
    </div>
  );
};
