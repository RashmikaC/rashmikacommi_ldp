import React, { useEffect, useState } from "react";
import axios from "axios";

export const PersonList = () => {
  const [persons, setPersons] = useState([{ id: "", name: "" }]);
  useEffect(() => {
    axios.get("http://localhost:3000/persons").then((res) => {
      const result: [{ id: string; name: string }] = res.data;
      console.log(result);
      setPersons(result);
    });
  }, []);
  return (
    <ul>
      {persons.map((person) => (
        <li key={person.id}>{person.name}</li>
      ))}
    </ul>
  );
};
