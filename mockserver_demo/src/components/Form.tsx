import axios from 'axios';
import React,{useState} from 'react'

interface myData {
    // id:string,
    name : string,
    branch : string,
}

export const Form = () => {
    const url='http://localhost:3000/students';

    const [data,setData]=useState({
        // id:"",
        name:"",
        branch:""
    });

    const changeHandler=(e: { target: { id: string; value: string; }; })=>{
        const newData={...data};
        newData[e.target.id as keyof myData]=e.target.value;
        setData(newData);
        console.log(newData)
    }

    const submit=(e: { preventDefault: () => void; })=>{
        e.preventDefault();
        axios.post(url,{
            // id:parseInt(data.id),
            name:data.name,
            branch:data.branch
        })
        .then(res=>{
            console.log(res.data)
        })
    }

  return (
    <div>
        <h2>Form</h2>
        <form onSubmit={submit}>
        {/* <label>Id :</label>
        <input type='number' id="id" value={data.id} onChange={changeHandler}></input><br /> */}
        <label>Name :</label>
        <input type='text' id="name" value={data.name} onChange={changeHandler}></input><br />
        <label>Branch :</label>
        <input type='text' id="branch" value={data.branch} onChange={changeHandler}></input><br />
        <button>Submit</button>
        </form>
    </div>
  )
}

 //id is optional(will be created automatically incrementing highest id present)
 // better not to keep id, coz when we give duplicate id error raises