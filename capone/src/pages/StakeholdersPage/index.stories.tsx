import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import StakeholdersPage from ".";

export default {
  title: "pages/StakeholdersPage",
  component: StakeholdersPage,
} as Meta<typeof StakeholdersPage>;

const Template: StoryFn<typeof StakeholdersPage> = (args: any) => (
  <StakeholdersPage {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
};
