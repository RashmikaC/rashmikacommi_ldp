import React from "react";
import { Meta, StoryFn } from "@storybook/react";
import Button from ".";

export default {
  title: "atoms/Button",
  component: Button,
  argTypes: {
    color: {
      control: { type: "text" },
    },
    size: {
      control: { type: "text" },
    },
  },
} as Meta<typeof Button>;

const Template: StoryFn<typeof Button> = (args) => <Button {...args} />;

export const Primary = Template.bind({});
Primary.args = {
  children: "Primary",
  variant: "contained",
};
