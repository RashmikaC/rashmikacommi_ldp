//Q1. Write a program to demonstrate how a function can be passed as a parameter to another function.
function even(num) {
  return num % 2 == 0;
}
function sumOfEven(number, func) {
  let sum = 0;
  for (let i = 1; i <= number; i++) {
    if (func(i)) sum += i;
  }
  console.log(sum);
}
sumOfEven(10, even);
sumOfEven(1000, even);
