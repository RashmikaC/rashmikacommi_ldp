import React from "react";
import { AlertButton } from "./AlertButton";

export const ReadingPropsInEventHandlers = () => {
  return (
    <div>
      <div>ReadingPropsInEventHandlers</div>
      <AlertButton message="Playing!">Play Movie</AlertButton>
      <AlertButton message="Uploading!">Upload Image</AlertButton>
    </div>
  );
};
