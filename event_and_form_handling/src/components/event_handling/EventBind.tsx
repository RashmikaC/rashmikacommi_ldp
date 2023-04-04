import React, { Component } from "react";

class EventBind extends Component<{}, { message: string }> {
  constructor(props: {}) {
    super(props);

    this.state = {
      message: "Hello",
    };

    // this.clickHandler = this.clickHandler.bind(this);
  }

  //   clickHandler() {
  //     this.setState({
  //       message: "Good bye",
  //     });
  //     console.log(this);
  //   }

  clickHandler = () => {
    this.setState({
      message: "Good bye",
    });
    console.log(this);
  };

  render() {
    return (
      <div>
        <div>{this.state.message}</div>

        {/* binding in the rendor method (every update to state will cause rerender, generates new event handler on every render)*/}
        {/* <button onClick={this.clickHandler.bind(this)}>Click</button> */}

        {/* arrow functions in render method (performance implications in some scenarios)*/}
        {/* <button onClick={()=> this.clickHandler()}>Click</button> */}

        {/* binding event handler in constructor */}
        {/* <button onClick={this.clickHandler}>Click</button> */}

        {/* class property as arrow functions */}
        <button onClick={this.clickHandler}>Click</button>
      </div>
    );
  }
}

export default EventBind;
