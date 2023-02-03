import React,{useState} from 'react'
import { AmountCard } from '../../atoms/AmountCard'
import { BTCCard } from '../../atoms/BTCCard'
import { BTSlider } from '../../atoms/BTSlider'
import './index.css'

export const AmountDetails = () => {
  const [value,setValue]=useState(0.023451)
  const [amount,setAmount]=useState(34000.00)
  const getData=(val:number)=>{
    // console.log("data in parent",val);
    setValue(val);
    calculateAmount(val);
  }
  const calculateAmount=(value:number)=>{
    const price = value*3406069.54;
    setAmount(price)
  }
  return (
    <div className='details'>
        <h4>Amount details</h4>
        <AmountCard amount={amount} />
        <BTSlider onChange={getData}/>
        <BTCCard value={value} />
    </div>
  )
}
