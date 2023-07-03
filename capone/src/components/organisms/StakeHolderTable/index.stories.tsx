import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import StakeHolderTable from ".";
import { tableData } from "../../utils/constants";

export default {
  title: "organisms/StakeHolderTable",
  component: StakeHolderTable,
} as Meta<typeof StakeHolderTable>;

const Template: StoryFn<typeof StakeHolderTable> = (args: any) => (
  <StakeHolderTable {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
  tableData: tableData,
};
