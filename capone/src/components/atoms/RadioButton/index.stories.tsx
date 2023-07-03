import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import RadioButton from ".";

export default {
  title: "atoms/RadioButton",
  component: RadioButton,
} as Meta<typeof RadioButton>;

const Template: StoryFn<typeof RadioButton> = (args: any) => (
  <RadioButton {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
};

