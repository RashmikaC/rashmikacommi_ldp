import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import {TableCell} from ".";

export default {
  title: "atoms/TableCell",
  component: TableCell,
} as Meta<typeof TableCell>;

const Template: StoryFn<typeof TableCell> = (args: any) => (
  <TableCell {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
    value:'Chris Nhat'
};

