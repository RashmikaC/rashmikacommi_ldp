import React, { useState } from "react";
import { AddInput } from "./AddInput";

export const Todo = () => {
  const [todos, setTodos] = useState([{task:''}]);

  return (
    <div>
      <AddInput setTodos={setTodos} todos={todos} />
    </div>
  );
};
