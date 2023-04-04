import React from "react";
import { ComponentStory, ComponentMeta } from "@storybook/react";
import { Button } from "./Button";

export default {
  title: "atoms/Button",
  component: Button,

} as ComponentMeta<typeof Button>;

const Template: ComponentStory<typeof Button> = (args) => <Button {...args} />;
export const Sign_In = Template.bind({});
Sign_In.args={variant: 'signIn',name:'Sign In'};

export const Buy = Template.bind({});
Buy.args={variant: 'buy',name:'BUY'};

export const Sell = Template.bind({});
Sell.args={variant: 'sell',name:'SELL'};

