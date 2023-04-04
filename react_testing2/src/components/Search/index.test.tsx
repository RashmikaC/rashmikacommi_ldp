import { render, screen } from "@testing-library/react";
import { MyApp } from "./MyApp";

describe("MyApp", () => {
  it("renders MyApp component", () => {
    render(<MyApp />);
    expect(screen.getByText("Search:")).toBeInTheDocument();
    expect(screen.getByText(/Searches/)).toBeInTheDocument();
    // expect(screen.getByText(/Searches for JavaScript/)).toBeNull();
    expect(screen.queryByText(/Searches for JavaScript/)).toBeNull();
    
  });
});
