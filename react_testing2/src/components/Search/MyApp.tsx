import React from "react";
import { Search } from ".";

export const MyApp = () => {
  const [search, setSearch] = React.useState("");

  function handleChange(event: {
    target: { value: React.SetStateAction<string> };
  }) {
    setSearch(event.target.value);
  }

  return (
    <div>
      <Search value={search} onChange={handleChange}>
        Search:
      </Search>

      <p>Searches for {search ? search : "..."}</p>
    </div>
  );
};
