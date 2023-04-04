import React,{useState,useEffect,useRef} from 'react'

export const MyRef = () => {
    const [name,setName]=useState("");
    // const [count,setCount]=useState(0);
    // useEffect(()=>{
    //     setCount(prevCount=>prevCount+1);
    // }) => infinite loop

    const count= useRef(1); //{current:1}

    useEffect(()=>{
        count.current=count.current+1
        console.log(count.current+"in effect")
    })
    console.log(count.current+"render");
  return (
    <>
        <input type='text' value={name} onChange={e => setName(e.target.value)}></input>
        <div>My name is {name}</div>
        <div>This has rendered {count.current} times</div>
    </>
  )
}
