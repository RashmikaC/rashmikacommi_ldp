import React from "react";
import { CryptoCurrency } from "../CryptoCurrency";
import "./index.css";
import {Stack} from '@mui/material'
import bitcoin from "../../../assets/Bitcoin.svg";
import ethereum from "../../../assets/Ethereum.svg";
import binance from "../../../assets/Binance.svg";
import tether from "../../../assets/Tether.svg";
import cardano from "../../../assets/Cardano.svg";
import xrp from "../../../assets/XRP.svg";
import dogecoin from "../../../assets/Dogecoin.svg";
import polkadot from "../../../assets/Polkadot.svg";
import tick from "../../../assets/Tick.svg";
import scroll from "../../../assets/Scroll.svg";

export const ChooseCrypto = () => {
  const data1 = [
    {
      src: ethereum,
      content1: "Ethereum",
      content2: "$240,048.03",
    },
    {
      src: binance,
      content1: "Binance",
      content2: "$30,054.88",
    },
    {
      src: tether,
      content1: "Tether",
      content2: "$74.21",
    },
  ];

  const data2 = [
    {
      src: cardano,
      content1: "Cardano",
      content2: "$138.22",
    },
    {
      src: xrp,
      content1: "XRP",
      content2: "$76.73",
    },
    {
      src: dogecoin,
      content1: "Dogecoin",
      content2: "$21.37",
    },
    {
      src: polkadot,
      content1: "Polkadot",
      content2: "$1,642.39",
    },
  ];

  const dataItems1 = data1.map((element) => {
    return (
      <CryptoCurrency
        src={element.src}
        content1={element.content1}
        content2={element.content2}
        key={element.content1}
      />
    );
  });

  const dataItems2 = data2.map((element) => {
    return (
      <CryptoCurrency
        src={element.src}
        content1={element.content1}
        content2={element.content2}
        key={element.content1}
      />
    );
  });

  return (
    <Stack className="block">
      <h3>Choose crypto</h3>
      <br></br>
      <div className="row">
        <div id="active">
          <CryptoCurrency
            src={bitcoin}
            content1="Bitcoin"
            content2="$3,406,069.54"
            select={tick}
          />
        </div>
        {dataItems1}
        <img id="scroll" src={scroll} alt="" />
      </div>
      <div className="row">
        {dataItems2}
      </div>
    </Stack>
  );
};
