import React from "react";
import { render, screen } from "@testing-library/react";
import CapitalizationTable from ".";

describe("CapitalizationTable", () => {
  it("renders the component with provided props", () => {
    render(<CapitalizationTable />);

    expect(screen.getByText("OUTSTANDING")).toBeInTheDocument();
    expect(screen.getByText("FULLY DILUTED")).toBeInTheDocument();
    expect(screen.getByText("Common")).toBeInTheDocument();
    expect(screen.getByText("Series C Prefered")).toBeInTheDocument();
    expect(screen.getByText("22 certificates")).toBeInTheDocument();
    expect(screen.getByText("$756,855 raised")).toBeInTheDocument();
  });
});
