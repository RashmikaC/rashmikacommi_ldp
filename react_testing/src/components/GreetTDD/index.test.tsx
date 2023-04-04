// GreetTDD should render the text Hello 
// If a name is passed it should render Hello followed by name
import { render, screen } from "@testing-library/react";
import { GreetTDD } from ".";

describe("GreetTDD",()=>{
    test("renders corrects", () => {
        render(<GreetTDD />);
        const textElement = screen.getByText("Hello");
        expect(textElement).toBeInTheDocument();
      });
      describe("Nested",()=>{
        test("renders with a name", () => {
            render(<GreetTDD name="Rashmika"/>);
            const textElement = screen.getByText("Hello Rashmika");
            expect(textElement).toBeInTheDocument();
          });
      })
      test("renders with a name2", () => {
        render(<GreetTDD name="Rashmika"/>);
        const textElement = screen.getByText("Hello Rashmika");
        expect(textElement).toBeInTheDocument();
      });
      describe("Nested2",()=>{
        test("renders with a name", () => {
            render(<GreetTDD name="Rashmika"/>);
            const textElement = screen.getByText("Hello Rashmika");
            expect(textElement).toBeInTheDocument();
          });
      })
      test("renders with a name3", () => {
        render(<GreetTDD name="Rashmika"/>);
        const textElement = screen.getByText("Hello Rashmika");
        expect(textElement).toBeInTheDocument();
      });
})
describe("GreetTDD2",()=>{
    test("renders with a name", () => {
        render(<GreetTDD name="Rashmika"/>);
        const textElement = screen.getByText("Hello Rashmika");
        expect(textElement).toBeInTheDocument();
      });
  })