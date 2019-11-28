const message = new Promise(function(resolve, reject){
    if(30>20){
        resolve("success");
    }else{
        reject("Failed");
    }
})

message.then(function(msg){
    console.log("Sucess Message ",msg)
}).catch(function(err){
    console.log("Failure Message ",err);
})



const employees = new Promise(function(resolve, reject){
    if(30>20){
        resolve([{
            name:"Bill Gates",
            age :67,
        },{name :"Mark Zukerberg",
        age:40},{
            name : "Jeff Bezos",
            age: 60 }]);
    }else{
        reject("Failed");
    }
})

employees.then(function(data){
    let dat= JSON.stringify(data)
    console.log("Emp Data ",dat);
}).catch(function(err){
    console.log("Falied Message ",err);
})

// closures

function outerFunction(counter){
    function innerFunction(){
        let count;
        count =counter+10;
        return count;
    }
    return innerFunction;
}
let innerFun=outerFunction(10);
   let counter =innerFun();
console.log("Counter value ",counter)