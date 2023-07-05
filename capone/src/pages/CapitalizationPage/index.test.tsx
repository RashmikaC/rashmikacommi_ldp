import React from "react";
import { render, screen } from "@testing-library/react";
import CapitalizationPage from ".";
import { BrowserRouter } from "react-router-dom";

describe("CapitalizationPage", () => {
  test("renders search input field", () => {
    render(
      <BrowserRouter>
        <CapitalizationPage />
      </BrowserRouter>
    );
    const searchInput = screen.getByPlaceholderText("Search...");
    expect(searchInput).toBeInTheDocument();
  });

  test("renders buttons with correct labels", () => {
    render(
      <BrowserRouter>
        <CapitalizationPage />
      </BrowserRouter>
    );
    const last7DaysButton = screen.getByText("Last 7 days");
    const dateRangeButton = screen.getByText("May 28-Jun 3");

    expect(last7DaysButton).toBeInTheDocument();
    expect(dateRangeButton).toBeInTheDocument();
  });

});
