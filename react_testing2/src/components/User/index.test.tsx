import { render, screen } from "@testing-library/react";
import { MyApp } from "./MyApp";

describe("MyApp", () => {
  it("renders MyApp component", async () => {
    render(<MyApp />);
    expect(screen.queryByText(/Signed in as Robin/)).toBeNull();
    expect(await screen.findByText(/Signed in as Robin/)).toBeInTheDocument();
  });
});
