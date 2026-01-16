
let age: number = 22;
let name: string = "Isha";
let isStudent: boolean = true;


function greet(userName: string, userAge: number): string {
  return `Hello ${userName}, you are ${userAge} years old.`;
}


console.log(greet(name, age));
