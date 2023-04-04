import React, { useState } from "react";

export const AddInput = ({
  setTodos,
  todos,
}: {
  setTodos: any;
  todos: { task: string }[];
}) => {
  const [todo, setTodo] = useState("");
  const changeHandler = (event: {
    target: { value: React.SetStateAction<string> };
  }) => {
    setTodo(event.target.value);
  };
  const clickHandler = () => {
    if (!todo) return;
    let updatedTodos = [
      ...todos,
      {
        task: todo,
      },
    ];
    setTodos(updatedTodos);
    setTodo("");
  };
  return (
    <>
        <label htmlFor="todo">Enter Todo:</label>
        <input type="text" id="todo" value={todo} onChange={changeHandler} />
        <button onClick={clickHandler}>Add</button>
    </>
  );
};
