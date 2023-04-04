import axios from "axios";
import React, { useState } from "react";

export const PersonRemoveAsyncAwait = () => {
  const [id, setID] = useState("");

  const handleChange = (e: { target: { value: string } }) => {
    setID(e.target.value);
  };

  const handleSubmit = async (e: { preventDefault: () => void }) => {
    e.preventDefault();
    const res = await axios.delete(
      `http://localhost:3000/persons/${id}`
    );

    console.log(res);
    console.log(res.data);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Person ID:
        <input type="number" value={id} onChange={handleChange} />
      </label>
      <button type="submit">Delete</button>
    </form>
  );
};
