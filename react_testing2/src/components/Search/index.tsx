import React from "react";

export const Search = ({
  value,
  onChange,
  children,
}: {
  value: string;
  onChange: any;
  children: string;
}) => {
  return (
    <div>
      <label htmlFor="search">{children}</label>
      <input id="search" type="text" value={value} onChange={onChange} />
    </div>
  );
};
