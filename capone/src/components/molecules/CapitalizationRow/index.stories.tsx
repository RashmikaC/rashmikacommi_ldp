import React from "react";
import { StoryFn, Meta } from "@storybook/react";
import CapitalizationRow from ".";
import theme from "../../../theme/theme";

export default {
  title: "molecules/CapitalizationRow",
  component: CapitalizationRow,
} as Meta<typeof CapitalizationRow>;

const Template: StoryFn<typeof CapitalizationRow> = (args: any) => (
  <CapitalizationRow {...args} />
);

export const Primary = Template.bind({});
Primary.args = {
  color: theme.palette.primary.primary500,
  title: "Common",
  col1: "22 certificates",
  col2: "$756,855 raised",
  col3: "1,000,000 authorized",
  outstanding: "5,350,812",
  ownership1: "33.289%",
  fullyDiluted: "5,350,812",
  ownership2: "25.934%",
};
