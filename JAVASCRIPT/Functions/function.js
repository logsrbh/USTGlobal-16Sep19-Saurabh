// Named Functions
function add(num1,num2)
{
    console.log('Sum= ',num1+num2);
}

add(10,20);

//function Expressin(Anonymous)

 var sub=function(num1,num2)
        {
            var SubValue = num1-num2;
            return SubValue;
        
}
 var value= sub(90,20);
 console.log("Value=",value );

 function add(num1,num2)
 {
     console.log('Sum= ',num1+num2);
 }

 function add(num1,num2,num3)
 {
     console.log("Sum= ",num1+num2+num3)
 }
     
 add(10,20,30);

 console.log("Hello");
 (function(num1,num2){
   console.log("Value= ",num1+num2);
 })
 (10,20);

   var div =(num1,num2) =>{
       console.log("Value ",num1+num2)
   } 
   div(10,50)

   var divv=num1 => console.log(num1)

   divv(90)

   var Add=(num1,num2)=>num1+num2;
     var value =Add(85,15)
     console.log(value)

     gretting("Hello");

     function gretting(msg)
     {
         console.log("Mesage= ",msg);
     }
     
     // I t will give errpor because only calling withoud a function is only valid for named function.
    //  greet('Dinga');
    //  var greet = function(msg)
    //  {
    //      console.log("Hii ",msg)
    //  }

    //  greets("Dingi");
    //  var greets=(msg)=>{
    //      console.log("Hi ",msg )g
    //  }

    console.log(hoist);
    var hoist=10;
    function hoist(){
     console.log(hoistingA)
     var hoistingA= 10;
    }
    hoist();
