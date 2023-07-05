import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import StakeholderDetailsCard from ".";

export default {
  title: "organisms/StakeholderDetailsCard",
  component: StakeholderDetailsCard,
} as Meta<typeof StakeholderDetailsCard>;

const Template: StoryFn<typeof StakeholderDetailsCard> = (args: any) => (
  <StakeholderDetailsCard {...args} />
);

export const AddStakeholder = Template.bind({});
AddStakeholder.args = {
    add:true
};
export const UpdateStakeholder = Template.bind({});
UpdateStakeholder.args = {
    update:true
};