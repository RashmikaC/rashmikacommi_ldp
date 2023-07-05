import React from "react";
import { render, screen } from "@testing-library/react";
import {Typography} from "./";

describe("Typography component", () => {

  test("renders with text content", () => {
    const text = "Hello, World!";
    render(<Typography>{text}</Typography>);
    const typographyElement = screen.getByText(text);
    expect(typographyElement).toBeInTheDocument();
  });

  test("renders with a variant", () => {
    const variant = "h1";
    render(<Typography variant={variant}>Heading</Typography>);
    const typographyElement = screen.getByRole("heading", { level: 1 });
    expect(typographyElement).toBeInTheDocument();
  });

  test("renders with custom styles", () => {
    const customStyle = { color: "red", fontSize: "20px" };
    render(<Typography style={customStyle}>Custom Style</Typography>);
    const typographyElement = screen.getByText("Custom Style");
    expect(typographyElement).toHaveStyle("color: red; font-size: 20px");
  });
});
