let h1Element=document.getElementById('demo');
console.log("Element of h1 is",h1Element)
console.log("Element Text =",h1Element.textContent);
console.log(h1Element.textContent="Good Evevning");
let buttonElelment=document.createElement('button')
buttonElelment.textContent="Click ME"
console.log(buttonElelment)

document.body.appendChild(buttonElelment)
let ulElement = document.createElement('ul');
let li1Element = document.createElement('li');
let li2Element = document.createElement('li');
let li3Element = document.createElement('li');

li1Element.textContent="java";
li2Element.textContent="sql";
li3Element.textContent="javascript";

ulElement.appendChild(li1Element);
ulElement.appendChild(li2Element);
ulElement.appendChild(li3Element);
document.body.appendChild(ulElement);

h1Element.style.color ="red";
h1Element.style.fontSize="25px";


function showMessage(){
    alert("Hii Hello There !!!")
}
function changeColor(){
    let pElement= document.getElementById('mover')
     pElement.style.color="red";
}
function removeColor(){
    let rElement = document.getElementById('mover')
    rElement.style.color ="black";
}

function printHello(){
    let userName=document.getElementById('username').value
    document.getElementById('showUsername').textContent=userName;       
}

let name="ABCD";
let age=21;
let phoneNum=9876543210;
console.log("Name is "+name+" Age is "+age+" Phone no is "+phoneNum);
console.log(`Name is ${name} Age  is ${age} Phone is ${phoneNum}`)
console.log(`2+2 =${2+2}`);