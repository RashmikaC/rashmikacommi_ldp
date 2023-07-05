import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import Dropdown from ".";

export default {
  title: "organisms/Dropdown",
  component: Dropdown,
} as Meta<typeof Dropdown>;

const Template: StoryFn<typeof Dropdown> = (args: any) => (
  <Dropdown {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
  top:'3rem',
  left:'1rem'
};
