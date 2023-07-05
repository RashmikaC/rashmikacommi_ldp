import React from "react";
import { render, screen, fireEvent, waitFor } from "@testing-library/react";
import StakeholderDetailsCard from ".";

test("should submit form with correct data when adding a new stakeholder", async () => {
  const onCloseMock = jest.fn();
  render(<StakeholderDetailsCard add onClose={onCloseMock} />);

  // Fill out the form fields
  const firstNameInput = screen.getByLabelText(/First name/i);
  fireEvent.change(firstNameInput, { target: { value: "John" } });

  const lastNameInput = screen.getByLabelText(/Last name/i);
  fireEvent.change(lastNameInput, { target: { value: "Doe" } });

  const contactEmailInput = screen.getByLabelText(/Contact email/i);
  fireEvent.change(contactEmailInput, {
    target: { value: "john.doe@example.com" },
  });

  fireEvent.click(screen.getByRole("button", { name: "Add stakeholder" }));

  // Wait for the form submission to be completed
  await waitFor(() => {
    expect(onCloseMock).toHaveBeenCalledTimes(1);
  });
});

test("should submit form with correct data when updating a stakeholder", async () => {
  const onCloseMock = jest.fn();
  const stakeholderData = {
    id: 1,
    name: "Jane Smith",
    email: "jane.smith@example.com",
    relation: "Colleague",
  };

  render(
    <StakeholderDetailsCard update {...stakeholderData} onClose={onCloseMock} />
  );

  // Change the first name
  const firstNameInput = screen.getByLabelText(/First name/i);
  fireEvent.change(firstNameInput, { target: { value: "Jane" } });

  // Click on the "Update" button
  const updateButton = screen.getByText(/Update/i);
  fireEvent.click(updateButton);

  // Wait for the form submission to be completed
  await waitFor(() => {
    expect(onCloseMock).toHaveBeenCalledTimes(1);
  });
});
