import { Meta , StoryFn}  from '@storybook/react';
import { Typography } from '.';
import theme from "../../../theme/theme";
import React from 'react';
export default {
    title: "atoms/Typography",
    component:Typography,
} as Meta<typeof Typography>

const template : StoryFn<typeof Typography> = args =><Typography {...args}></Typography>

export const Greeting = template.bind({})
Greeting.args={
    children:"Welcome!",
    variant:'H1',
    sx:{
        color: `${theme.palette.textColor.highEmphasis}`,    
    }
}