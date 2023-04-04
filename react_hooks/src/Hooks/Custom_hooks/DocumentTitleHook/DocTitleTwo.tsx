import React,{useState} from 'react'
import { useDocumentTitle } from './useDocumentTitle';

export const DocTitleTwo = () => {
    const [count,setCount]=useState(0);

    useDocumentTitle(count)
    
  return (
    <button onClick={()=>{setCount(count+5)}}>Count-{count}</button>
  )
}
