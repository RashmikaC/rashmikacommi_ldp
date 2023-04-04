import React from 'react'
import './index.css';

interface Props{
    header?:string,
    company?:string,
    location?:string
}

export const Typography = (props:Props) => {
  return (
    <div id="font">
        <div id='header'>{props.header}</div>
        <div id='company'>{props.company}</div>
        <div id='location'>{props.location}</div>
    </div>
  )
}
