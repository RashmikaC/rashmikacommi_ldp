import React from "react";
import { ComponentStory, ComponentMeta } from "@storybook/react";
import { MyTypography } from ".";

export default {
  title: "atoms/Typography",
  component: MyTypography,

} as ComponentMeta<typeof MyTypography>;

const Template: ComponentStory<typeof MyTypography> = (args) => <MyTypography {...args} />;
export const Title = Template.bind({});
Title.args={variant: 'title',content:'Bitcoin'};

export const Amount = Template.bind({});
Amount.args={variant: 'amount',content:'$3,406,069.54'};
