import React, { useContext } from 'react'
// import ComponentF from './ComponentF'
 import { UserContext, ChannelContext} from './MyContext'

function ComponentE() {
    // return <ComponentF />

  const user = useContext(UserContext)
  const channel = useContext(ChannelContext)
  return <div> User is {user} and channel is {channel}</div>
}

export default ComponentE