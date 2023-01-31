import React from 'react'

interface Props {
    src: string
}
export const Icon =({src,...props}:Props) =>{
  return (
   <div>
   <img src={src} alt=""/>
   </div>
  )
}