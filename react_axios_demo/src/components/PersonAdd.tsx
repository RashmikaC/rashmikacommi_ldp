import axios from 'axios';
import React, { useState } from 'react'

interface myData{
    name:string,
    email:string
}

export const PersonAdd = () => {
    const [data,setData]=useState({
        name:'',
        email:''
    });
    const changeHandler=(e: { target: { id: string; value: string; }; })=>{
        const newData={...data};
        newData[e.target.id as keyof myData]=e.target.value;
        setData(newData);
        console.log(newData);
    }
    const submit=(e: { preventDefault: () => void; })=>{
        e.preventDefault();
        axios.post('http://localhost:3000/persons',{
            name:data.name,
            email:data.email
        })
        .then((res)=>{
            console.log(res.data);
        })
        .catch(error=>{
            console.log(error)
        })
    }
  return (
    <form onSubmit={submit}>
        <label>Name:</label>
        <input type='text' id="name" value={data.name} onChange={changeHandler}></input><br />
        <label>Email:</label>
        <input type='email' id="email" value={data.email} onChange={changeHandler}></input><br />
        <button type='submit'>Submit</button>
    </form>
  )
}
