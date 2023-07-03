import React from "react";
import { render, screen } from "@testing-library/react";
import CapitalizationRow from ".";

describe("CapitalizationRow", () => {
  const defaultProps = {
    color: "#000000",
    title: "Sample Title",
    col1: "Column 1",
    col2: "Column 2",
    col3: "Column 3",
    outstanding: "Outstanding",
    ownership1: "Ownership 1",
    fullyDiluted: "Fully Diluted",
    ownership2: "Ownership 2",
  };

  it("renders the component with provided props", () => {
    render(<CapitalizationRow {...defaultProps} />);

    expect(screen.getByText("Sample Title")).toBeInTheDocument();
    expect(screen.getByText("Column 1")).toBeInTheDocument();
    expect(screen.getByText("Column 2")).toBeInTheDocument();
    expect(screen.getByText("Column 3")).toBeInTheDocument();
    expect(screen.getByText("Outstanding")).toBeInTheDocument();
    expect(screen.getByText("Ownership 1")).toBeInTheDocument();
    expect(screen.getByText("Fully Diluted")).toBeInTheDocument();
    expect(screen.getByText("Ownership 2")).toBeInTheDocument();
    expect(screen.getByAltText("rightIcon")).toBeInTheDocument();
  });

  it("does not render col3 if it is not provided", () => {
      <CapitalizationRow {...defaultProps} col3="" />

    expect(screen.queryByText("Column 3")).toBeNull();
  });
});
