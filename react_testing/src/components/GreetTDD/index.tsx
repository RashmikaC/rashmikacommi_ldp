import React from 'react'

type GreetProps={
    name?:string
}

export const GreetTDD = (props:GreetProps) => {
  return (
    <div>Hello {props.name}</div>
  )
}
