import React from "react";
// import "./index.css";
import { Typography } from "@mui/material";


interface Props {
  variant?: "title" | "amount";
  content: string;
}

export const MyTypography = ({ variant, content, ...props }: Props) => {
  return (
    // <div className={`typography ${variant}`} {...props}>
    //   {content}
    // </div>
    <Typography variant="subtitle1">{content}</Typography>
  );
};
