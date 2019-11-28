console.log("Window Object",window);
console.log("This Keyword",this);
console.log(window===this);
// window.alert("This is Alert box");
// alert("Welcome to Javascript class");
// let confirmDele=confirm("Are you sure you want to delete");
// console.log("Confirm Delete ",conirmDele);
// console.log("User name =", window.prompt("Whta is your name ",'John'));

const person={
    firstName :"Alia",
    age :26,
    lastName :"Kapoor",
    getName : function(){
        console.log("This Keyword ",this);
        return this.firstName+' '+this.lastName;
    }
}
let FullName = person.getName()
console.log("Full Name = ", FullName)