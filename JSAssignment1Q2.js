//Q2. An arrow function takes two arguments firstName and lastName and returns a 2 letter string that represents the first letter of both the arguments. For the arguments Roger and Waters, the function returns ‘RW’. Write this function.
const two_letter_name = (firstName,lastName) => {
    const l1=firstName.charAt(0);
    const l2=lastName.charAt(0);
    return l1+l2;
}
console.log(two_letter_name("Rashmika","Commi"));
console.log(two_letter_name("Roger","Waters"));