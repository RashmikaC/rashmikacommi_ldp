import React from 'react'

export const Button = ({ onClick, children }:{ onClick:any, children:any }) => {
  return (
    <button onClick={e => {
        e.stopPropagation();
        onClick();
      }}>
        {children}
      </button>
  )
}

//to prevent an event from reaching parent components, we need to call e.stopPropagation()