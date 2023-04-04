import React, { useState, useEffect } from "react";

export const MyEffect = () => {
  const [resourceType, setResourceType] = useState("posts");
  // console.log("render")

  useEffect(()=>{
    console.log("resource type changed")

    return()=>{
      console.log("return from resource change")
    }
  },[resourceType])

  // useEffect(()=>{
  //   console.log("onMount")
  // },[])

  return (
    <>
      <div>
        <button onClick={() => setResourceType("posts")}>Posts</button>
        <button onClick={() => setResourceType("users")}>Users</button>
        <button onClick={() => setResourceType("comments")}>Comments</button>
      </div>
      <h1>{resourceType}</h1>
    </>
  );
};
