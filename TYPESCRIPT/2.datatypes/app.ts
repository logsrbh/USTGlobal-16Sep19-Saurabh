let myName : String="Michal";
console.log(myName, typeof myName);

let age : number;
console.log(age, typeof age);

let mobileNumber ="9976543210";
console.log(mobileNumber, typeof mobileNumber);

let address;
console.log(address, typeof address);
address =9876543210;
console.log(address, typeof address);

let calAge = function() : void{
    console.log("Age is 26");
} 
calAge();

class person{
    constructor(public name : String, public age :number){

    }    
}
let person1 = new person("Mike",27);
console.log(person1);

class student extends person{
    constructor(name: String, age:number , public num:number){
        super(name,age)

    }

}
let student1 = new student("John",26,9876543210);
console.log(student1);
