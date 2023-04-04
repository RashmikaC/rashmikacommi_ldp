import React from 'react'

interface Props{
message:string;
children:any;
}

export const AlertButton = ({message,children}:Props) => {
  return (
    <button onClick={() => alert(message)}>
    {children}
  </button>
  )
}
