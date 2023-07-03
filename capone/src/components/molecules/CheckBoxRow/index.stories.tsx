import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import CheckBoxRow from ".";

export default {
  title: "molecules/CheckBoxRow",
  component: CheckBoxRow,
} as Meta<typeof CheckBoxRow>;

const Template: StoryFn<typeof CheckBoxRow> = (args: any) => (
  <CheckBoxRow {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
  rowData: {
    id: 1,
    stakeHolder: "Audrey Simmmons",
    portfolioEmail: "ckctm12@gmail.com",
    contactEmail: "caringgene@aol.com",
    relationship: "Ex-employee",
    costCenter: "Product",
    ownership: "-",
  },
};
