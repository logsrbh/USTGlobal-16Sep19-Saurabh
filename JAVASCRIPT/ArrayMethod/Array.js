const hobbies = ['Sleeping', 'Cricket', 'Eating', 'Coding', 'Roaming'];
console.log(typeof (hobbies));
console.log("Array or not ", Array.isArray(hobbies));
console.log("Using Includes Method ", hobbies.includes('Cricket', 100));
console.log("After Push Method", hobbies.push('Guitar', 'Volleyball'))//it wil add in th last index
console.log("After POP method ", hobbies.pop());
console.log("After Ushift= ", hobbies.unshift('Numistmatics', 'Singing'));
console.log("After Shift= ", hobbies.shift());
console.log("After Splice= ", hobbies.splice(1, 2, 'BirdWatching', 'PUBG'));

const hobbies1 = ['Sleeping', 'Cricket', 'Eating', 'Coding', 'Roamin']
hobbies1.splice(1, 2, 'BirdWatching', 'PUBG');
console.log("After splice ", hobbies1);
var sllice = hobbies1.slice(2, 4);
console.log("After slice ", hobbies1);
console.log("After slice new Array = ", sllice);
console.log("Index of = ", hobbies1.indexOf('Coding', 0));

const numbers = [100, 200, 300, 400, 500]

const nums1 = numbers.map(function (value, index) {
    let newValue = value + 50;
    return newValue
})

console.log("After map method = ", nums1);
console.log("Is the old array is changing ?",numbers);
const nums2 = numbers.map(value => value + 5000)
console.log("After map Arrow funct ion", nums2)

const filterNum =
numbers.filter(function(value,index){
    if(value>200){
        return true;
    }
    else{
        return false;
    }
})
console.log("After filter = ",filterNum)

const num3 = numbers.filter(value=>value>200)
console.log("After map Arrow Function= ",num3)

