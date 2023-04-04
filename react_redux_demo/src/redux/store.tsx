import { legacy_createStore as createStore, applyMiddleware } from "redux";
import logger from "redux-logger";
// import { cakeReducer } from "./cake/cakeReducer";
// export const store = createStore(cakeReducer);
import rootReducer from "./rootReducer";
import thunk from "redux-thunk";
export const store = createStore(rootReducer, applyMiddleware(logger, thunk));
