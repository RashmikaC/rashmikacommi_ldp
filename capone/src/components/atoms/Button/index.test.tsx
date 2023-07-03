import React from "react";
import { render , screen} from "@testing-library/react";
import Button from ".";

describe("Button component", () => {
  test("renders without any props", () => {
    render(<Button />);
    const buttonElement = screen.getByRole("button");
    expect(buttonElement).toBeInTheDocument();
  });

  test("renders with a label", () => {
    render(<Button>Click me</Button>);
    const buttonElement = screen.getByText("Click me");
    expect(buttonElement).toBeInTheDocument();
  });

  test("renders with custom styles", () => {
    render(<Button style={{ color: "red" }} />);
    const buttonElement = screen.getByRole("button");
    expect(buttonElement).toHaveStyle("color: red");
  });

  test("renders with a disabled state", () => {
    render(<Button disabled />);
    const buttonElement = screen.getByRole("button");
    expect(buttonElement).toBeDisabled();
  });
});
