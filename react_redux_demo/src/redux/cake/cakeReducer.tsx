import { BUY_CAKE } from "./cakeTypes";
const initialState = {
  numOfCakes: 10,
};

export const cakeReducer = (state = initialState, action:any) => {
  switch (action.type) {
    case BUY_CAKE:
      return { ...state, numOfCakes: state.numOfCakes - action.payload};
    default:
      return state;
  }
};
