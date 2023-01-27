import React from 'react'
import './Button.css'
interface Props {
   
    variant:'signIn'|'buy'|'sell';
    name:string;
}
export const Button =({variant,...props}:Props) =>{
  return (
    <button className={`button ${variant}`} {...props}>
    {props.name}
    </button>
  )
}