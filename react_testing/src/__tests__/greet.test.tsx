import { render, screen } from "@testing-library/react";
import { Greet } from "../components/Greet/index";

test("Greet renders corrects", () => {
  render(<Greet />);
  const textElement = screen.getByText(/hello/i);//regex, ignore case
  expect(textElement).toBeInTheDocument();
});
