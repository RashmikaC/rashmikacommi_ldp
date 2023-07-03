import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import Header from ".";

export default {
  title: "molecules/Header",
  component: Header,
} as Meta<typeof Header>;

const Template: StoryFn<typeof Header> = (args: any) => <Header {...args} />;

export const Primary = Template.bind({});
Primary.args = {};
