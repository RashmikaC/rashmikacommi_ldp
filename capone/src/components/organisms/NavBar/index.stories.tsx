import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import NavBar from ".";
import { NAVBAR_ITEMS } from "../../utils/constants";

export default {
  title: "organisms/NavBar",
  component: NavBar,
} as Meta<typeof NavBar>;

const Template: StoryFn<typeof NavBar> = (args: any) => <NavBar {...args} />;

export const Primary = Template.bind({});
Primary.args = {
  activeElement: NAVBAR_ITEMS[3].title,
};
