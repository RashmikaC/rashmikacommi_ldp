import React, { useState } from 'react'
import { connect } from 'react-redux'
import { buyCake } from '../redux'

function NewCakeContainer (props : any) {
  const [number, setNumber] = useState(1)
  return (
    <div>
      <h2>Number of cakes : {props.numOfCakes} </h2>
      <input type='text' value={number} onChange={(e:any) => setNumber(e.target.value)} />
      <button onClick={() => props.buyCake(number)}>Buy {number} Cakes</button>
    </div>
  )
}

const mapStateToProps = (state: { cake: { numOfCakes: any } }) => {
  return {
    numOfCakes: state.cake.numOfCakes
  }
}

const mapDispatchToProps = (dispatch: (arg0: { type: string }) => any) => {
  return {
    buyCake: (number: any) => dispatch(buyCake(number))
  }
}

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(NewCakeContainer)