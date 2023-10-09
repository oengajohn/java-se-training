let listVal = ["Joe", "Paul", "Alice", "Tom"];

let namesWithLengthGrThan3 = listVal.filter((name) => name.length > 3);

console.log(namesWithLengthGrThan3);

namesWithLengthGrThan3.forEach((name) => console.log(name.length));

let numbers = [1, 2, 3, 4, 5];

let evenNumbers = numbers.filter((n) => n % 2 === 0);
console.log(evenNumbers);

let evenNumbersSquared = evenNumbers.map((n) => n * n);

console.log(evenNumbersSquared);

console.log(numbers.filter((n) => n % 2 === 0).map((n) => n * n));
