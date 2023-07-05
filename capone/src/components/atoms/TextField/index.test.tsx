import React from "react";
import { render, screen } from "@testing-library/react";
import TextField from "./";

describe("TextField component", () => {
  test("renders without any props", () => {
    render(<TextField />);
    const textFieldElement = screen.getByRole("textbox");
    expect(textFieldElement).toBeInTheDocument();
  });

  test("renders with a label", () => {
    const label = "Name";
    render(<TextField label={label} />);
    const textFieldElement = screen.getByLabelText(label);
    expect(textFieldElement).toBeInTheDocument();
  });

  test("renders with a placeholder", () => {
    const placeholder = "Enter your name";
    render(<TextField placeholder={placeholder} />);
    const textFieldElement = screen.getByPlaceholderText(placeholder);
    expect(textFieldElement).toBeInTheDocument();
  });

  test("renders with a default value", () => {
    const defaultValue = "John Doe";
    render(<TextField defaultValue={defaultValue} />);
    const textFieldElement = screen.getByDisplayValue(defaultValue);
    expect(textFieldElement).toBeInTheDocument();
  });

});
