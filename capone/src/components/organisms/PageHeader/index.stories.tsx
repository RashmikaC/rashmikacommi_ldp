import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import PageHeader from ".";

export default {
  title: "organisms/PageHeader",
  component: PageHeader,
} as Meta<typeof PageHeader>;

const Template: StoryFn<typeof PageHeader> = (args: any) => (
  <PageHeader {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
  title: "All stakeholders",
  buttons: true,
};
