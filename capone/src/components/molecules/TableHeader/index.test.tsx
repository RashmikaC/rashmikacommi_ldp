import React from "react";
import { render, screen } from "@testing-library/react";
import TableHeader from ".";
import { tableHeaders } from "../../utils/constants";

describe("TableHeader component", () => {
  test("renders the checkbox", () => {
    render(<TableHeader />);
    const checkboxElement = screen.getByTestId("checkbox");
    expect(checkboxElement).toBeInTheDocument();
  });

  test("renders the table headers", () => {
    render(<TableHeader />);
    tableHeaders.forEach((header) => {
      const headerElement = screen.getByText(header);
      expect(headerElement).toBeInTheDocument();
    });
  });
});
