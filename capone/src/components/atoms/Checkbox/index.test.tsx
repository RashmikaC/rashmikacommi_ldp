import React from "react";
import { render, screen } from "@testing-library/react";

import Checkbox from ".";

describe("Checkbox component", () => {
  test("renders unchecked checkbox", () => {
    render(<Checkbox />);
    const checkboxElement = screen.getByTestId("checkbox");
    expect(checkboxElement).toBeInTheDocument();
    expect(checkboxElement).not.toBeChecked();
  });

  test("applies custom styles", () => {
    render(<Checkbox sx={{ marginTop: "10px" }} />);
    const checkboxElement = screen.getByTestId("checkbox");
    expect(checkboxElement).toHaveStyle("margin-top: 10px");
  });
});
