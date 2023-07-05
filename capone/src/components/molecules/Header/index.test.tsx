import React from "react";
import { render, screen } from "@testing-library/react";
import Header from ".";

describe("Header component", () => {
  test("renders the CapOne logo", () => {
    render(<Header />);
    const logoElement = screen.getByAltText("CapOne");
    expect(logoElement).toBeInTheDocument();
  });

  test("renders the Meetly text", () => {
    render(<Header />);
    const meetlyTextElement = screen.getByText("Meetly");
    expect(meetlyTextElement).toBeInTheDocument();
  });

  test("renders the DownIcon", () => {
    render(<Header />);
    const downIconElement = screen.getByAltText("icon");
    expect(downIconElement).toBeInTheDocument();
  });

  test("renders the Task text", () => {
    render(<Header />);
    const taskTextElement = screen.getByText("Task");
    expect(taskTextElement).toBeInTheDocument();
  });

  test("renders the Downloads text", () => {
    render(<Header />);
    const downloadsTextElement = screen.getByText("Downloads");
    expect(downloadsTextElement).toBeInTheDocument();
  });

  test("renders the User icon", () => {
    render(<Header />);
    const userIconElement = screen.getByAltText("User");
    expect(userIconElement).toBeInTheDocument();
  });
});
