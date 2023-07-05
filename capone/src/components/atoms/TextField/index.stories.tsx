import { Meta , StoryFn}  from '@storybook/react';
import  TextField  from '.';
import { InputAdornment } from '@mui/material';
import SearchIcon from '@mui/icons-material/Search';
import React from 'react';

export default {
    title: "atoms/TextField",
    component:TextField,
} as Meta<typeof TextField>

const template : StoryFn<typeof TextField> = args =><TextField {...args}></TextField>

export const Search = template.bind({})
Search.args={
    placeholder:"Search...",
    type:"text",
    size:"small",
    InputProps:{
        startAdornment:<InputAdornment position="start"><SearchIcon /></InputAdornment>
    }
}