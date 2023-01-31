import React from "react";
import { ComponentStory, ComponentMeta } from "@storybook/react";
import { Icon } from ".";
import bitcoin from "../../../../public/images/Bitcoin.svg";
import ethereum from "../../../../public/images/Ethereum.svg";
import binance from "../../../../public/images/Binance.svg";
import tether from "../../../../public/images/Tether.svg";
import cardano from "../../../../public/images/Cardano.svg";
import xrp from "../../../../public/images/XRP.svg";
import dogecoin from "../../../../public/images/Dogecoin.svg";
import polkadot from "../../../../public/images/Polkadot.svg";

export default {
  title: "atoms/Icon",
  component: Icon,
} as ComponentMeta<typeof Icon>;

const Template: ComponentStory<typeof Icon> = (args) => <Icon {...args} />;

export const Bitcoin = Template.bind({});
Bitcoin.args = {
  src: bitcoin,
};

export const Ethereum = Template.bind({});
Ethereum.args = {
  src: ethereum,
};

export const Binance = Template.bind({});
Binance.args = {
  src: binance,
};

export const Tether = Template.bind({});
Tether.args = {
  src: tether,
};

export const Cardano = Template.bind({});
Cardano.args = {
  src: cardano,
};

export const XRP = Template.bind({});
XRP.args = {
  src: xrp,
};

export const Dogecoin = Template.bind({});
Dogecoin.args = {
  src: dogecoin,
};

export const Polkadot = Template.bind({});
Polkadot.args = {
  src: polkadot,
};
