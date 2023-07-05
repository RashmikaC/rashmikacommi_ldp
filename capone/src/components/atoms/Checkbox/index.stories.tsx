import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import Checkbox from ".";

export default {
  title: "atoms/Checkbox",
  component: Checkbox,
} as Meta<typeof Checkbox>;

const Template: StoryFn<typeof Checkbox> = (args: any) => (
  <Checkbox {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
};

