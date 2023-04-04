import React from "react";
import { ComponentStory, ComponentMeta } from "@storybook/react";
import { Icon } from "./Icon";
import dashboardIcon from '../../../../public/images/dashboard.png'
import bellIcon from '../../../../public/images/bell.png'
import logoutIcon from '../../../../public/images/logout.png'

export default {
  title: "atoms/Icon",
  component: Icon,
} as ComponentMeta<typeof Icon>;

const Template: ComponentStory<typeof Icon> = (args) => <Icon {...args} />;

export const Dashboard = Template.bind({});
Dashboard.args = {
  src:dashboardIcon
};

export const Bell = Template.bind({});
Bell.args = {
  src:bellIcon
};

export const LogOut = Template.bind({});
LogOut.args = {
  src:logoutIcon
};
