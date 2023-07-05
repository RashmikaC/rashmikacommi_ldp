import React from "react";
import { render, screen } from "@testing-library/react";
import { TableCell } from "./";

describe("TableCell component", () => {
  test("renders with a value prop", () => {
    const value = "Sample Value";
    render(<TableCell value={value} />);
    const tableCellElement = screen.getByText(value);
    expect(tableCellElement).toBeInTheDocument();
  });

});
