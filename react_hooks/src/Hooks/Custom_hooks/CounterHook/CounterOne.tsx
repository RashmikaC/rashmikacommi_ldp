import React from 'react'
import useCounter from './useCounter'

function CounterOne() {
	const data = useCounter(1, 0)

	return (
		<div>
			<h2>Count = {data.count}</h2>
			<button onClick={data.increment}>Increment</button>
			<button onClick={data.decrement}>Decrement</button>
			<button onClick={data.reset}>Reset</button>
		</div>
	)
}

export default CounterOne