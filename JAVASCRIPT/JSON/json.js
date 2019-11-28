var person={
    name:"Sunadara",
    age:100,
    color:"White",
    address:{
        city :"Bijapur",
        state :"Karnataka",
        pin :591115,
    },
    hobbies : ['Netflix','Coding','Birdwatching','Singing']
}
 console.log("JavaScript Person Object ",person);
 const jsonObject=JSON.stringify(person);
 console.log("JavaScript Person object ",jsonObject);
 const jscriptObject=JSON.parse(jsonObject);
 console.log(jscriptObject);

 localStorage.setItem('email',"bilgates@gmail.com");
  let emailValue =localStorage.getItem('email');
  console.log(emailValue)
  localStorage.clear();
  