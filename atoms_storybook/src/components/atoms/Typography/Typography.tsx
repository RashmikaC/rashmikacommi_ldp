import React from "react";
import "./Typography.css";
interface Props {
  variant: "loginHeader" | "mainHeader" | "subheader" | "text" |"boldText" | "blueText";
  content: string;
}

export const Typography = ({ variant, content, ...props }: Props) => {
  return <div className={`typography ${variant}`} {...props}>
    {content}
  </div>;
};
