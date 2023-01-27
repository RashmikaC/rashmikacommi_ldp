import React from "react";
import { ComponentStory, ComponentMeta } from "@storybook/react";
import { Input } from "./Input";

export default {
  title: "atoms/Input",
  component: Input,
} as ComponentMeta<typeof Input>;

const Template: ComponentStory<typeof Input> = (args) => <Input {...args} />;

export const Email = Template.bind({});
Email.args = {
  type: "email",
  variant: "email",
  placeholder: "you@company.com",
};

export const Password = Template.bind({});
Password.args = {
  type: "password",
  variant: "password",
  placeholder: "Enter Password",
};

export const Search = Template.bind({});
Search.args = {
  type: "text",
  variant: "search",
  placeholder: "Search all assets",
};