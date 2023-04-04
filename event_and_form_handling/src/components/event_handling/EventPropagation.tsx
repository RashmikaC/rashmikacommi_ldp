import React from 'react'

export const EventPropagation = () => {
  return (
    <div style={{backgroundColor:"blueviolet"}} onClick={() => {
        alert('You clicked on the toolbar!');
      }}>
      <button onClick={() => alert('Playing!')}>
        Play Movie
      </button>
      <button onClick={() => alert('Uploading!')}>
        Upload Image
      </button>
    </div>
  )
}
//If you click on either button, its onClick will run first, followed by the parent <div>’s onClick. So two messages will appear. If you click the toolbar itself, only the parent <div>’s onClick will run.