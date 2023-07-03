import React from "react";
import { render, screen } from "@testing-library/react";
import StakeholdersPage from ".";
import { BrowserRouter } from "react-router-dom";

describe("StakeholdersPage", () => {
  test("renders the page correctly", () => {
    render(
      <BrowserRouter>
        <StakeholdersPage />
      </BrowserRouter>
    );

    // Assert that the page components are rendered correctly
    expect(screen.getByText("All stakeholders")).toBeInTheDocument();
    expect(screen.getByPlaceholderText("Search...")).toBeInTheDocument();
    expect(screen.getByAltText("button")).toBeInTheDocument();
  });
});
