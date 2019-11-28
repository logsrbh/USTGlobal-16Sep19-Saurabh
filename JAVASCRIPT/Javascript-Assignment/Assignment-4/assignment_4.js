console.log("1");
var movies = ['Token', 'Jurrasic-Park', 'Inception', 'Friends', 'oblivion', 'avtar', 'Avanger', 'Spider-Man', 'Captain-America', 'MArvel'];

//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= movies.length; i++) {
    console.log("Movies name Using For Loop = ", movies[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in movies) {
    console.log("Movies name using In lop = ", movies[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of movies) {
    console.log("MOvies using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
movies.forEach(function (item, index) {
    console.log("Movies name using forEach Loop =", item)
})

//<------------------Using For-IN LOOP FOr Object------------------------------>
var obj = [{
    item: 'table',
    id: 1
},
{
    item: 'chairr',
    id: 2
},
{
    item: 'watch',
    id: 3
},
{
    item: 'bike',
    id: 4
},
{
    item: 'Mat',
    id: 5
},
{
    item: 'Calculator',
    id: 6
},
{
    item: 'Table',
    id: 7
},
{
    item: 'LCD',
    id: 8
},
{
    item: "LED",
    id: 9
},
{
    item: "Oled",
    id: 10
}
]
for (var ref in obj) {
    console.log("Item using For-In Loop = ", obj[ref])
}
console.log("2");
var car = ['Benet', 'Suzuki', 'Yamaha', 'Rolls Royals'];
//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= car.length; i++) {
    console.log("car name Using For Loop = ", car[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in car) {
    console.log("Car name using In lop = ", car[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of car) {
    console.log("Car using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
car.forEach(function (item, index) {
    console.log("Car name using forEach Loop =", item)
})
console.log("3");
var bike = ['dukati', 'yamha', 'Royal-Enfield', 'duke'];

//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= bike.length; i++) {
    console.log("bike name Using For Loop = ", bike[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in bike) {
    console.log("bike name using In lop = ", bike[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of bike) {
    console.log("bike using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
bike.forEach(function (item, index) {
    console.log("bike name using forEach Loop =", item)
})
console.log("4");
var bike = ['dukati', 'yamha', 'Royal-Enfield', 'duke'];

//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= bike.length; i++) {
    console.log("bike name Using For Loop = ", bike[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in bike) {
    console.log("bike name using In lop = ", bike[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of bike) {
    console.log("bike using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
bike.forEach(function (item, index) {
    console.log("bike name using forEach Loop =", item)
})
console.log("5");
var color = ['red','green','blue','pink']
//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= color.length; i++) {
    console.log("Color name Using For Loop = ", color[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in color) {
    console.log("color name using In lop = ", color[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of color) {
    console.log("color using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
color.forEach(function (item, index) {
    console.log("color name using forEach Loop =", item)
})
console.log("6");
var number= ['five','six','ten','four']
//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= number.length; i++) {
    console.log("Elemnt name Using For Loop = ", number[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in number) {
    console.log("Elemrnt name using In lop = ", number[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of number) {
    console.log("Elementr using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
number.forEach(function (item, index) {
    console.log("Element name using forEach Loop =", item)
})
console.log("7");
var actor= ['ritik','srk','ranvir','shahid']
//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= actor.length; i++) {
    console.log("Elemnt name Using For Loop = ", actor[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in actor) {
    console.log("Elemrnt name using In lop = ",actor[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of actor) {
    console.log("Elementr using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
actor.forEach(function (item, index) {
    console.log("Element name using forEach Loop =", item)
})
console.log("8");
var book = ['horror','comedy','romantic']
//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= book.length; i++) {
    console.log("Elemnt name Using For Loop = ", book[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in book) {
    console.log("Elemrnt name using In lop = ",book[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of book) {
    console.log("Elementr using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
book.forEach(function (item, index) {
    console.log("Element name using forEach Loop =", item)
})

console.log("9");
var subject = ['maths','hindi','english','science']
//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= subject.length; i++) {
    console.log("Elemnt name Using For Loop = ", subject[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in subject) {
    console.log("Elemrnt name using In lop = ",subject[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of subject) {
    console.log("Elementr using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
subject.forEach(function (item, index) {
    console.log("Element name using forEach Loop =", item)
})

console.log("10");
var laptop = ['hp','apple','asus','lenovo']
//<----------------------Using For LOOP----------------------------------------->
for (var i = 0; i <= laptop.length; i++) {
    console.log("Elemnt name Using For Loop = ", laptop[i])
}
//<-------------------Using For-IN LOOP----------------------------------------->
for (var ind in laptop) {
    console.log("Elemrnt name using In lop = ",laptop[ind])
}

//<-------------------Using ForOF LOOP----------------------------------------->
for (var ele of laptop) {
    console.log("Elementr using OF loop = ", ele)
}
//<------------------Using ForEACH LOOP---------------------------------------->
laptop.forEach(function (item, index) {
    console.log("Element name using forEach Loop =", item)
})
