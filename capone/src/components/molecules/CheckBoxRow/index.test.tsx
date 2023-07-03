import React from "react";
import { render, screen } from "@testing-library/react";
import CheckBoxRow from ".";

describe("CheckBoxRow component", () => {
  const rowData = {
    id:1,
    stakeHolder: "John Doe",
    portfolioEmail: "john.doe1@example.com",
    contactEmail: "john.doe2@example.com",
    relationship: "Business",
    costCenter: "123456",
    ownership: "100%",
  };

  test("renders the checkbox", () => {
    render(<CheckBoxRow rowData={rowData} onEditClick={function (): void {
        throw new Error("Function not implemented.");
    } } />);
    const checkboxElement = screen.getByTestId("checkbox");
    expect(checkboxElement).toBeInTheDocument();
  });

  test("renders the table cells with correct values", () => {
    render(<CheckBoxRow rowData={rowData} onEditClick={function (): void {
        throw new Error("Function not implemented.");
    } } />);
    const tableCellElements = screen.getAllByTestId("table-cell");
    expect(tableCellElements).toHaveLength(6);

    const expectedValues = [
      rowData.stakeHolder,
      rowData.portfolioEmail,
      rowData.contactEmail,
      rowData.relationship,
      rowData.costCenter,
      rowData.ownership,
    ];

    tableCellElements.forEach((element, index) => {
      expect(element).toHaveTextContent(expectedValues[index]);
    });
  });

  test("renders the MoreHorizIcon", () => {
    render(<CheckBoxRow rowData={rowData} onEditClick={function (): void {
        throw new Error("Function not implemented.");
    } } />);
    const iconElement = screen.getByTestId("MoreHorizIcon");
    expect(iconElement).toBeInTheDocument();
  });
});
