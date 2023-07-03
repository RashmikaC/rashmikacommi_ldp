import React from "react";
import { render, screen, fireEvent } from "@testing-library/react";
import Dropdown from ".";

describe("Dropdown component", () => {
  test("displays the dropdown menu on click", () => {
    render(<Dropdown />);
    const dropdownIcon = screen.getByTestId("KeyboardArrowDownOutlinedIcon");
    fireEvent.click(dropdownIcon);
    const dropdownMenu = screen.getByTestId("dropdown-menu");
    expect(dropdownMenu).toBeInTheDocument();
  });

  test("hides the dropdown menu on second click", () => {
    render(<Dropdown />);
    const dropdownIcon = screen.getByTestId("KeyboardArrowDownOutlinedIcon");
    fireEvent.click(dropdownIcon);
    fireEvent.click(dropdownIcon);
    const dropdownMenu = screen.queryByTestId("dropdown-menu");
    expect(dropdownMenu).toBeNull();
  });
});
