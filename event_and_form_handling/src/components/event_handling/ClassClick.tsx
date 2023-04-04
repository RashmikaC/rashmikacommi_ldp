import React, { Component } from 'react'

export default class ClassClick extends Component {

    clickHandler(){
        console.log("Button2 clicked");
    }

  render() {
    return (
      <div>
        <button onClick={this.clickHandler}>Button2</button>
      </div>
    )
  }
}
