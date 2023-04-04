import React from "react";
import "./index.css";
import bike from "../../../assets/bike.svg";
import bus from "../../../assets/bus.svg";
import car from "../../../assets/car.svg";
import rail from "../../../assets/rail.svg";

export const RouteIcons = () => {
  return (
    <div id='font'>
      <div id="routes">Commute routes available:</div>
      <div className="icons">
        <img src={bike} alt="bike"></img>
        <img src={bus} alt="bus"></img>
        <img src={car} alt="car"></img>
        <img src={rail} alt="rail"></img>
      </div>
      <span id="time">1hr 36 mins ago</span>
    </div>
  );
};
