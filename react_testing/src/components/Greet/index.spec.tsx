import { render, screen } from "@testing-library/react";
import { Greet } from ".";

describe("Greet", () => {
  it("Greet renders corrects", () => {
    render(<Greet />);
    const textElement = screen.getByText(/hello/i); //regex, ignore case
    expect(textElement).toBeInTheDocument();
  });
});
// test can be replaced with it
// test.only ⇔ fit
// test.skip ⇔ xit.