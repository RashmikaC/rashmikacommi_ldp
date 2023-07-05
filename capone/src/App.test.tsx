import React from "react";
import { ThemeProvider } from "@emotion/react";
import { render, screen } from "@testing-library/react";
import theme from "./theme/theme";
import App from "./App";

test("rendering the App", () => {
  render(
    <ThemeProvider theme={theme}>
      <App></App>
    </ThemeProvider>
  ); 
  expect(screen.getByTestId("app")).toBeInTheDocument();
});
