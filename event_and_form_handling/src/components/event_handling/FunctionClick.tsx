import React from 'react'

export const FunctionClick = () => {
    function clickHandler(){
        console.log("Button1 clicked");
    }
  return (
    <div>
        <button onClick={clickHandler}>Button1</button>
    </div>
  )
}
