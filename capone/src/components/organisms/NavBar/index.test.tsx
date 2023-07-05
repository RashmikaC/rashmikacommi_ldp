import React from "react";
import { render, screen, fireEvent } from "@testing-library/react";
import NavBar from ".";
import { BrowserRouter, useNavigate } from "react-router-dom";

jest.mock("react-router-dom", () => {
  const originalModule = jest.requireActual("react-router-dom");

  return {
    ...originalModule,
    useNavigate: jest.fn(),
  };
});

describe("NavBar component", () => {
  const mockActiveElement = "Company";
  const navigateMock = jest.fn();

  beforeEach(() => {
    (useNavigate as jest.Mock).mockReturnValue(navigateMock);
  });

  test("renders the navbar items", () => {
    render(
      <BrowserRouter>
        <NavBar activeElement={mockActiveElement} />
      </BrowserRouter>
    );
    const navbarItems = screen.getAllByTestId(/^sidebar-/);
    expect(navbarItems.length).toBeGreaterThan(0);
  });

  test("sets the active page correctly", () => {
    render(
      <BrowserRouter>
        <NavBar activeElement={mockActiveElement} />
      </BrowserRouter>
    );
    const activeNavbarItem = screen.getByTestId(`sidebar-${mockActiveElement}`);
    expect(activeNavbarItem).toHaveClass("active");
  });

  test("updates the active page on click and navigates to 'Stakeholders' page", () => {
    render(
      <BrowserRouter>
        <NavBar activeElement={mockActiveElement} />
      </BrowserRouter>
    );
    const stakeholdersNavItem = screen.getByTestId("sidebar-Stakeholders");
    fireEvent.click(stakeholdersNavItem);
    expect(stakeholdersNavItem).toHaveClass("active");
  });

  test("updates the active page on click and navigates to 'Capitalization' page", () => {
    render(
      <BrowserRouter>
        <NavBar activeElement={mockActiveElement} />
      </BrowserRouter>
    );
    const capitalizationNavItem = screen.getByTestId("sidebar-Capitalization");
    fireEvent.click(capitalizationNavItem);
    expect(capitalizationNavItem).toHaveClass("active");
  });
});
