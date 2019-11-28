// var brands =['KingFisher','Bisleri','Aqua','Kinley']
//  for(var brand of brands)
//  {
//      console.log("Brand = ",brand);
//  }
//  console.log("--------------------------------------------");
//  for(var index in brands)
//  {
//      console.log("Brand= ",brands[index]);
//  }
//  console.log("--------------------------------------------");
//  console.log("For in Loop For Objects");
//  var person={
//      name:'Sundari',
//      age:33,
//      colāor:'white'
//  }
//  for(var key in person){
//      console.log('value ',person[key]);
//  }
//  console.log("................................................");

//  console.log("For Each Method of Array")
//  var movies=['Sholay','Titanic','Jurassic Park','Mayabazar']
//  movies.forEach(function(value,index){
//      console.log('Movie index = ',index);      
//      console.log('Movie = ',value);

//  })
//  console.log("--------------------------------------------");
// console.log("For each method of Array for Objects ");
// var items = [{
//     item: 'bangles',
//     id: 1,
//     price: 100
// },
// {
//     item: 'eyeliner',
//     id: 2,
//     price: 150
// },
// {
//     item: 'watch',
//     id: 3,
//     price: 5000
// },
// {
//     item: 'bike',
//     id: 4,
//     price: 100000
// }
// ]
// items.forEach(function(item,index){
//     console.log("Obj is ", item);
//    // console.log("Item index is",index);
// })
 

var name;   //declaration
var name= 'Pailwan'; //re-declaration
name= "Prasnatham"; //re-assigniment

//console.log(name1); //hoisting
let name1; // declaration
//let name1="Saho"; // re-declaration
name1="VAlmiki"; // reassigning

//const name2; // only declaration not possible
const name2= "Drea  Girl"; // initialization;
//name2="Kabir Singh" // reassignment not possible;

console.log("--------------------using var Keywod------------------")


for (var i = 0; i < 5; i++) {
    console.log("Inside loop = ", i);
}
console.log("Outside loop= ", i);

console.log("--------------------using Let Keywod------------------")
for (let a = 0; a < 5; a++) {
    console.log("Inside loop = ", a);
}
console.log("Outside loop= ", a);