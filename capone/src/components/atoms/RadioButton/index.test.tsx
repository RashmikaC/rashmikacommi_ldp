import React from "react";
import { render, screen } from "@testing-library/react";
import RadioButton from "./";

describe("RadioButton component", () => {
  test("renders without any props", () => {
    render(<RadioButton />);
    const radioButtonElement = screen.getByRole("radio");
    expect(radioButtonElement).toBeInTheDocument();
  });

  test("renders with checked state", () => {
    render(<RadioButton checked />);
    const radioButtonElement = screen.getByRole("radio");
    expect(radioButtonElement).toBeChecked();
  });

});
