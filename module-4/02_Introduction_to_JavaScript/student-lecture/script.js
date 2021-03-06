/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables() {
  console.log('JavaScript!');
  let myStrVar = "a string variable";
  let myNumVar = 3.14;
  let myNumVar2 = 9999;
  let myBoolVar = false;

  let myArray = [3, 4, 23, 12];

  let age = 20;
  console.log("age is: " + age);
  console.log(`age is: ${age} yep`);
 

}

/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {

  console.log('param 1 is' + param1);
  console.log('param 2 is ' + param2);
}

/**
 * Compares two values x and y.
 * == is loose equality
 * === is strict equality
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {

  console.log(" x == y: "  + (x==y));
  console.log('x === y ' + (x===y));
}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {

  if(x) {
    console.log(x +' is truthy');
  } else {
    console.log(x + ' is falsy');
  }
}

/**
 *  Objects are simple key-value pairs
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects() {

  const person = {
    firstName: "Bob",
    lastName: "Loblaw",
    age: 40,
    employees: ["Mister Man", "Duuuude", "Broooo"],
    toString: function() {
      return this.firstName + " " + this.lastName + " " + this.employees;
    }
  }
  console.log("first name: " + person.firstName);
  console.log("employees " + person.employees);
  console.log(person.toString());
}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overriden and the most recent one will be used.
*/

function Add(num1, num2) {
  return num1 + num2;
}

function Add(num1, num2, num3) {
  return num1 + num2 + num3;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
  console.log("Math.random() : " + Math.random());
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {

  /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */

    let someString = 'Herro wurrld';
    console.log("length of the string is " + someString.length);
    console.log("substring " + someString.substr(3,5));
    console.log("za " + someString.substr(6));
}
