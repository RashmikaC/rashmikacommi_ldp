import React from "react";
import { buyCake } from "../redux";
import { connect } from "react-redux";

const CakeContainer = (props: any) => {
  return (
    <div>
      <h2>Number of cakes : {props.numOfCakes}</h2>
      <button onClick={props.buyCake}>Buy Cake</button>
    </div>
  );
};
const mapStateToProps = (state:any) => {
  return {
    numOfCakes: state.cake.numOfCakes,
  };
};
const mapDispatchToProps = (dispatch: any) => {
  return {
    buyCake: () => {
      dispatch(buyCake());
    },
  };
};
export default connect(mapStateToProps, mapDispatchToProps)(CakeContainer);
