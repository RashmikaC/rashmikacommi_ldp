import React from "react";
import ComponentC from "./ComponentC";

export const UserContext = React.createContext('');
export const ChannelContext = React.createContext('');

export const MyContext = () => {
  return (
    <div>
      <UserContext.Provider value={"ABC"}>
        <ChannelContext.Provider value={"XYZ"}>
          <ComponentC />
        </ChannelContext.Provider>
      </UserContext.Provider>
    </div>
  );
};
