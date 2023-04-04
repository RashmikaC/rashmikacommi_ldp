import React from "react";
import "./Input.css";
interface Props {
  type: "email" | "password"  | "text";
  variant: "email" | "password" |"search";
  placeholder: string;
}

export const Input = ({ type, variant, ...props }: Props) => {
  return <input type={type} className={`input ${variant}`} {...props} />;
};
