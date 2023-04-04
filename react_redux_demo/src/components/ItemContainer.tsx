import React from 'react'
import { connect } from 'react-redux'
import { buyCake, buyIceCream } from '../redux'

function ItemContainer (props:any) {
  return (
    <>
      <h2>Item : {props.item}</h2>
      <div>
        <button onClick={props.buyItem}>Buy Items</button>
      </div>
    </>
  )
}

const mapStateToProps = (state:any, ownProps:any) => {
  const itemState = ownProps.cake
    ? state.cake.numOfCakes
    : state.iceCream.numOfIceCreams
  return {
    item: itemState
  }
}

const mapDispatchToProps = (dispatch:any, ownProps:any) => {
  const dispatchFunction = ownProps.cake
    ? () => dispatch(buyCake())
    : () => dispatch(buyIceCream())
  return {
    buyItem: dispatchFunction
  }
}

export default connect(
  mapStateToProps,
  mapDispatchToProps
)(ItemContainer)

//If there is no mapStateToProps func, replace it with null in connect()
//connect(null,mapDispatchToProps)