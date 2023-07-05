import React from "react";
import { render, screen } from "@testing-library/react";
import PageHeader from ".";

describe("PageHeader component", () => {
  test("renders the title", () => {
    const title = "Sample Title";
    render(<PageHeader title={title} />);
    const titleElement = screen.getByText(title);
    expect(titleElement).toBeInTheDocument();
  });

  test("renders the buttons when 'buttons' prop is true", () => {
    render(<PageHeader title="Sample Title" buttons={true} />);
    const downloadButtonElement = screen.getByRole("button", {
      name: /Download report/i,
    });
    expect(downloadButtonElement).toBeInTheDocument();

  });

  test("does not render the buttons when 'buttons' prop is false", () => {
    render(<PageHeader title="Sample Title" buttons={false} />);
    const downloadButtonElement = screen.queryByRole("button", {
      name: /Download report/i,
    });
    expect(downloadButtonElement).toBeNull();

  });
});
