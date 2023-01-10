//Refactor the following function into a one-liner:
const printName = (name) => "Hi" + name;
//Rewrite the following code using template literals
const printBill = (name, bill) => {
  return `Hi ${name}, please pay: ${bill}`;
};
//Modify the following code such that the object properties are destructured and logged.
const person = {
  name: "Noam Chomsky",
  age: 92,
};

const {name,age}=person;
console.log(`name is ${name} and age is ${age}`);