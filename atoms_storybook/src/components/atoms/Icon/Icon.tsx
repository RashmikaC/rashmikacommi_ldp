import React from 'react'
// import {RiDashboard3Line, RiLogoutBoxLine} from "react-icons/ri"
// import {AiOutlineBell} from 'react-icons/ai'

interface Props {
    src: string
}
export const Icon =({src,...props}:Props) =>{
  return (
   <>
   <img src={src} alt=""/>
   </>
  )
}