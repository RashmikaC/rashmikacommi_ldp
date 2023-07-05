import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import TableHeader from ".";

export default {
  title: "molecules/TableHeader",
  component: TableHeader,
} as Meta<typeof TableHeader>;

const Template: StoryFn<typeof TableHeader> = (args: any) => <TableHeader {...args} />;

export const Primary = Template.bind({});
Primary.args = {};
