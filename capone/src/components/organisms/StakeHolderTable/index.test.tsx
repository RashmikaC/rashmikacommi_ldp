import React from "react";
import { render, screen } from "@testing-library/react";
import StakeHolderTable from ".";
import { tableData } from "../../utils/constants";

describe("StakeHolderTable component", () => {
  test("renders the table headers", () => {
    render(<StakeHolderTable tableData={tableData} />);
    const headerText = screen.getByText("STAKEHOLDER");
    expect(headerText).toBeInTheDocument();

  });

  test("renders the table rows", () => {
    render(<StakeHolderTable tableData={tableData} />);
    tableData.forEach((rowData) => {
      const rowElement = screen.getByText(rowData.stakeHolder);
      expect(rowElement).toBeInTheDocument();

    });
  });
});
