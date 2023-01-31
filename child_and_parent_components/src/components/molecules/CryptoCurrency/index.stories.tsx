import React from "react";
import { ComponentStory, ComponentMeta } from "@storybook/react";
import { CryptoCurrency } from ".";
import bitcoin from "../../../../public/images/Bitcoin.svg";
import ethereum from "../../../../public/images/Ethereum.svg";
import binance from "../../../../public/images/Binance.svg";
import tether from "../../../../public/images/Tether.svg";
import cardano from "../../../../public/images/Cardano.svg";
import xrp from "../../../../public/images/XRP.svg";
import dogecoin from "../../../../public/images/Dogecoin.svg";
import polkadot from "../../../../public/images/Polkadot.svg";

export default {
  title: "molecules/CryptoCurrency",
  component: CryptoCurrency,
} as ComponentMeta<typeof CryptoCurrency>;

const Template: ComponentStory<typeof CryptoCurrency> = (args) => <CryptoCurrency {...args} />;

export const Bitcoin = Template.bind({});
Bitcoin.args = {
  src: bitcoin,
  content1: "Bitcoin",
  content2: "$3,406,069.54"
};

export const Ethereum = Template.bind({});
Ethereum.args = {
  src: ethereum,
  content1: "Ethereum",
  content2: "$240,048.03"
};

export const Binance = Template.bind({});
Binance.args = {
  src: binance,
  content1: "Binance",
  content2: "$30,054.88"
};

export const Tether = Template.bind({});
Tether.args = {
  src: tether,
  content1: "Tether",
  content2: "$74.21"
};

export const Cardano = Template.bind({});
Cardano.args = {
  src: cardano,
  content1: "Cardano",
  content2: "$138.22"
};

export const XRP = Template.bind({});
XRP.args = {
  src: xrp,
  content1: "XRP",
  content2: "$76.73"
};

export const Dogecoin = Template.bind({});
Dogecoin.args = {
  src: dogecoin,
  content1: "Dogecoin",
  content2: "$21.37"
};

export const Polkadot = Template.bind({});
Polkadot.args = {
  src: polkadot,
  content1: "Polkadot",
  content2: "$1,642.39"
};
