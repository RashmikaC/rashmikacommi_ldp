import React from "react";
import { TextField as MuiTextField, TextFieldProps } from "@mui/material";

const TextField = (props: TextFieldProps) => {
  return (
    <div>
      <MuiTextField {...props}></MuiTextField>
    </div>
  );
};

export default TextField;
