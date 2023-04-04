import React,{useState,useCallback} from 'react'
import { List } from './List';

export const MyCallback = () => {
    const [num,setNum]=useState(1);
    const [dark,setDark]=useState(false);
    const getItems=useCallback((incrementor: number)=>{
        return [num+incrementor,num+incrementor+1,num+incrementor+2]
    },[num])
    const theme={
        backgroundColor:dark?'#333':'#FFF',
        color:dark?'#FFF':'#333'
    }
  return (
    <div style={theme}>
        <input type='number' value={num} onChange={e=>setNum(parseInt(e.target.value))} />
        <button onClick={()=>setDark(prevDark => !prevDark)}>Toggle theme</button>
        <List getItems={getItems}></List>
    </div>
  )
}
