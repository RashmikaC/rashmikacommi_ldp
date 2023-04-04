import React from "react";
import { ComponentStory, ComponentMeta } from "@storybook/react";
import { Typography } from "./Typography";

export default {
  title: "atoms/Typography",
  component: Typography,

} as ComponentMeta<typeof Typography>;

const Template: ComponentStory<typeof Typography> = (args) => <Typography {...args} />;
export const LoginHeader = Template.bind({});
LoginHeader.args={variant: 'loginHeader',content:'Login to Minet'};

export const MainHeader = Template.bind({});
MainHeader.args={variant: 'mainHeader',content:'Dashboard'};

export const Subheader = Template.bind({});
Subheader.args={variant: 'subheader',content:'Watchlist'};

export const SmallText = Template.bind({});
SmallText.args={variant: 'text',content:'Total Investment'};

export const BoldText = Template.bind({});
BoldText.args={variant: 'boldText',content:'Bitcoin'};

export const BlueText = Template.bind({});
BlueText.args={variant: 'blueText',content:'Discover assets'};