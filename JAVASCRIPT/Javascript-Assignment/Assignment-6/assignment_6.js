// var username = document.getElementById('uname');

// username.addEventListener("keyup", function(){
//     var usernameValue = username.value;
//     console.log(usernameValue);
//     if(username.getAttribute("maxlength") > 5){
//         document.getElementById('btn').removeAttribute("disabled");
//     }
// });

// function typing(){
//     if(this.value.length >0)
//     {
//         document.getElementById('btn').disabled=false;
//     }
//     else{
//         document.getElementById('btn').disabled=true;
//     }
// }

function showPwd(){
    let type1=document.getElementById("pwd").type
    if(type1=='password'){
     let psw=document.getElementById("pwd").value
     console.log(psw);
     document.getElementById("pwd").type="text"
     document.getElementById("pwd").textContent=psw;
    }
    else{
     document.getElementById("pwd").type="password"
    }
   
    }