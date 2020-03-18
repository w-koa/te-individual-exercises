/*
 * Document this function
 */
/**
 * Function isSummer returns true if between June 20th and Sept 20th and in the northern hemisphere.
 * returns true if between Dec. 20th and Mar. 20th if in the southern hemisphere.
 * @param {number} month number of month
 * @param {number} day day in month
 * @param {string} hemisphere the name of the hemisphere
 * @returns {boolean} true if the season is summer based on month/day and hemisphere entered.
 */
function isSummer(month, day = 1, hemisphere = 'northern') {
  if (month === 7 || month === 8) {
    return hemisphere === 'northern';
  } else if (month === 6 && day >= 20) {
    return hemisphere === 'northern';
  } else if (month === 9 && day <= 20) {
    return hemisphere === 'northern';
  } else if (month === 1 || month === 2) {
    return hemisphere === 'southern';
  } else if (month === 12 && day >= 20) {
    return hemisphere === 'southern';
  } else if (month === 3 && day <= 20) {
    return hemisphere === 'southern';
  } else {
    return false;
  }
}

/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the students is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * We admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */
  function isAdmitted(gpa, satScore = 0, recommendation = false) {
    if (gpa > 4.0 || satScore > 1300 || (gpa > 3.0 && recommendation == true) || (satScore > 1200 && recommendation == true)) {
      return true;
    } else
    return false;
  }

/**
 * Write a function called useParameterToFilterArray so that it takes an anonymous
 * function and uses that in `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
let unfilteredArray = [1, 2, 3, 4, 5, 6];

  function useParameterToFilterArray(filterFunction) {
    return unfilteredArray.filter(filterFunction);
  }
/**
 * Write a function called makeNumber to take two strings
 * of digits, concatenate them together, and then return
 * the value back as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * should return the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */
function makeNumber(first, second = "") {
  let numberString = first + second;
  let number = parseInt(numberString);
  return number;
}

/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds them all together. Return the result.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */
function addAll() {
  let sum = 0;
  for (i = 0; i < arguments.length; i++) {
    sum = sum + arguments[i] ;
  }
  return sum;
}

/*
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 */
function makeHappy(stringArray) {
  
  let happyStrings = stringArray.map((word) => "Happy " + word);
 
  return happyStrings;
}

/*
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into mailing addresses in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 */
/**
 * 
 * @param {object[]} addresses an array of address objects which include streetNumber, streetName, 
 * streetType, city, state, and zip.
 * @returns {string[]} returns array of each formatted address as a string.
 */
function getFullAddressesOfProperties(addresses) {
  let addressArray = addresses.map((address) => {return [address.streetNumber, address.streetName, address.streetType, 
  address.city, address.state, address.zip].join(" ")});
  return addressArray;
}

/*
 * Create and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It should work for strings and numbers.
 */
/**
 * 
 * @param {string or number} array a string or number array to be evaluated.
 * @returns {number} largest, largest number found.
 */
function findLargest(array) {
  let largest = "";
  array.forEach((variable) => { if (variable > largest) {
    largest = variable;
    }
  })
  return largest;
}

/*
 * CHALLENGE
 * Create and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays and add up all sub values and return
 * the sum. For instance, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * You would return 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */
/**
 * 
 * @param {number[]} array array of arrays to be added together
 * @returns {number} final, summed total of all subarrays. Returns 0 if there are no parameters
 * or if the array is empty.
 */
 function getSumOfSubArrayValues(array = []) {
   let newArray = [];
   let final = 0;
  if (array.length == 0 || array == undefined) {
    return 0;
  }
   array.forEach(element => {
     newArray.push(element.reduce((subelement, subtotal) => {return subtotal + subelement}));
     
   });
   
  
   final = (newArray.reduce((sub, total) =>  sub + total));
   
   return final;
 }