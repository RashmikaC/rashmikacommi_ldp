import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import CapitalizationTable from ".";

export default {
  title: "organisms/CapitalizationTable",
  component: CapitalizationTable,
} as Meta<typeof CapitalizationTable>;

const Template: StoryFn<typeof CapitalizationTable> = (args: any) => (
  <CapitalizationTable {...args} />
);

export const Primary = Template.bind({});
Primary.args = {};
