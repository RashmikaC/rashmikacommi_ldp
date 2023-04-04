import React from 'react'
import { Button } from './Button';

export const Toolbar = () => {
  return (
    <div style={{backgroundColor:"blueviolet"}} onClick={() => {
        alert('You clicked on the toolbar!');
      }}>
        <Button onClick={() => alert('Playing!')}>
          Play Movie
        </Button>
        <Button onClick={() => alert('Uploading!')}>
          Upload Image
        </Button>
      </div>
  )
}
