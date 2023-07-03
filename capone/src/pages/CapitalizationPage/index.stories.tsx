import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import CapitalizationPage from ".";

export default {
  title: "pages/CapitalizationPage",
  component: CapitalizationPage,
} as Meta<typeof CapitalizationPage>;

const Template: StoryFn<typeof CapitalizationPage> = (args: any) => (
  <CapitalizationPage {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
};
