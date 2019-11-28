const items = [{
    item: 'Earring',
    id: 1,
    price: 5000
},
{
    item: 'Kajal',
    id: 2,
    price: 1000
},
{
    item: 'Trimmer',
    id: 3,
    price: 3000
},
{
    item: 'Beardo',
    id: 4,
    price: 170
}]


const items2 = items.map(value => {
    const container = {};
    container[value.item] = value.item;
    container.id = value.id;
    container.price = value.price + 300;
    return container;
})
console.log("After map Arrow function", items2);

console.log("------------------------------------------------")
console.log('=========2==============')
const cars = [{
    name: 'Audi',
    id: 2,
    price: 500000
}, {
    name: 'BMW',
    id: 2,
    price: 1000000
}, {
    name: 'Nano',
    id: 3,
    price: 100000
}, {
    name: 'Swift',
    id: 4,
    price: 500000
}]

const cars1 = cars.map(value => {

    const container1 = {};
    container1.name = value.name;
    container1.id = value.id;
    container1.price = value.price + 600;
    return container1;
})
console.log(cars1)
//console.log(items)

console.log('=========3===================')

const bikes = [{
    name: 'Duke',
    id: 2,
    price: 200000
}, {
    name: 'NS200',
    id: 2,
    price: 200000
}, {
    name: 'CBR',
    id: 3,
    price: 150000
}, {
    name: 'KTM',
    id: 4,
    price: 200000
}]

const bikes1 = bikes.map(value => {
    const container2 = {};
    container2.name = value.name;
    container2.id = value.id;
    container2.price = value.price + 300;
    return container2;
})
console.log(bikes1)
//console.log(items)
console.log('=========4===================')

const mobiles = [{
    name: 'Redmi',
    id: 2,
    price: 20000
}, {
    name: 'Honor 7x',
    id: 2,
    price: 20000
}, {
    name: 'Nokia',
    id: 3,
    price: 15000
}, {
    name: 'Samsung',
    id: 4,
    price: 25000
}]

const mobiles1 = mobiles.map(value => {
    const container3 = {};
    container3.name = value.name;
    container3.id = value.id;
    container3.price = value.price + 300;
    return container3;
})
console.log(mobiles1)
//console.log(items)

console.log('=========5===================')

const books = [{
    name: 'A',
    id: 2,
    price: 200
}, {
    name: 'B',
    id: 2,
    price: 300
}, {
    name: 'C',
    id: 3,
    price: 150
}, {
    name: 'D',
    id: 4,
    price: 2000
}]

const books1 = books.map(value => {
    const container4 = {};
    container4.name = value.name;
    container4.id = value.id;
    container4.price = value.price + 300;
    return container4;
})
console.log(books1)
//console.log(items)
console.log('=========6===================')

const movieTickets = [{
    name: 'Sahoo',
    id: 2,
    price: 200
}, {
    name: 'Valmiki',
    id: 2,
    price: 150
}, {
    name: 'Sye ra',
    id: 3,
    price: 300
}, {
    name: 'Arjun reddy',
    id: 4,
    price: 200
}]

const movieTickets1 = movieTickets.map(value => {
    const container5 = {};
    container5.name = value.name;
    container5.id = value.id;
    container5.price = value.price + 300;
    return container5;
})
console.log(movieTickets1)
//console.log(items)
console.log('=========7===================')

const pens = [{
    name: 'Reynolds',
    id: 2,
    price: 20
}, {
    name: 'B',
    id: 2,
    price: 20
}, {
    name: 'C',
    id: 3,
    price: 15
}, {
    name: 'D',
    id: 4,
    price: 20
}]

const pens1 = pens.map(value => {
    const container6 = {};
    container6.name = value.name;
    container6.id = value.id;
    container6.price = value.price + 300;
    return container6;
})
console.log(pens1)
//console.log(items)

console.log('=========8===================')

const pencils = [{
    name: 'A',
    id: 2,
    price: 20
}, {
    name: 'B',
    id: 2,
    price: 20
}, {
    name: 'C',
    id: 3,
    price: 15
}, {
    name: 'D',
    id: 4,
    price: 20
}]

const pencils1 = pencils.map(value => {
    const container7 = {};
    container7.name = value.name;
    container7.id = value.id;
    container7.price = value.price + 300;
    return container7;
})
console.log(pencils1)
//console.log(items)
console.log('=========9===================')

const Shoes = [{
    name: 'Reebook',
    id: 2,
    price: 2000
}, {
    name: 'Adidas',
    id: 2,
    price: 2500
}, {
    name: 'Puma',
    id: 3,
    price: 3000
}, {
    name: 'Sparx',
    id: 4,
    price: 1000
}]

const Shoes1 = Shoes.map(value => {
    const container8 = {};
    container8.name = value.name;
    container8.id = value.id;
    container8.price = value.price + 300;
    return container8;
})
console.log(Shoes1)
//console.log(items)
console.log('=========10===================')

const Shirts = [{
    name: 'Puma',
    id: 2,
    price: 1500
}, {
    name: 'Arrow',
    id: 2,
    price: 700
}, {
    name: 'Allen solley',
    id: 3,
    price: 1500
}, {
    name: 'Reymond',
    id: 4,
    price: 2000
}]

const Shirts1 = Shirts.map(value => {
    const container9 = {};
    container9.name = value.name;
    container9.id = value.id;
    container9.price = value.price + 300;
    return container9;
})
console.log(Shirts1)
//console.log(items)

//<-----------------------------------------Array Objects---------------------------------------->
console.log("Array Objects")
var car = ['Ducati', 'Bennet', 'Hyundai', 'Audi', 'BMW', 'Benz']
car.forEach(function (item, index) {
    console.log("Elemnts is", item)
})
console.log("Is Array or Not ", Array.isArray(car));
console.log("After Using Includes", car.includes('Ducati', 1));
console.log("After Push ", car.push('Rolls Royals'));
console.log("After POP method ", car.pop());
console.log("After Ushift= ", car.unshift('Maruti', 'Suzuki'));
console.log("After Shift= ", car.shift());
console.log("After Splice= ", car.splice(1, 2, 'polo', 'volkswagon'));
var sllice = car.slice(2, 4);
console.log("After slice ", car);
console.log("After slice new Array = ", sllice);
console.log("Index of = ", car.indexOf('Coding', 0));
const item0 = car.map(function(item,index){
    
})


console.log("------------------------------------------------")
const numbers = [100, 200, 300, 400, 500]
numbers.forEach(function (item, index) {
    console.log("Elemrnt is ", item);
})
//using isArray
console.log("Is Array or not ", numbers);
//using inclue
console.log("After using includes ", numbers.includes(100));
//using push
console.log("After push ", numbers.push(600));
//using pop
console.log("After pop ", numbers.pop());
//using Unshift
console.log("After Unshift =", numbers.unshift(50));
//using shift
console.log("After Shift =", numbers.shift())
//using splice
console.log("After splice =", numbers.splice(1, 1, 800, 200));
//using slice
var slice1 = numbers.slice(1, 3);
console.log("After slice ", numbers);
console.log("After slice new array is", slice1);
console.log("indexOf ", numbers.indexOf(800, 0))
console.log("....................................................................................")
const flipkart = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);


//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);

//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);


//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);

//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);

//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);

//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);



//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);


//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);

//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);


//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);

//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);

//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')

//2 ex------------------------------------
const amazon = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);


//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);

//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);


//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);

//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);

//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);

//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);



//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);


//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);

//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);


//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);

//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);

//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')

//3--------------
const myntra = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);


//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);

//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);


//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);

//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);

//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);

//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);



//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);


//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);

//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);


//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);

//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);

//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')

//4---------------------------------------------------------------------------
const trends = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);


//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);

//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);


//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);

//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);

//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);

//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);



//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);


//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);

//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);


//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);

//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);

//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')

//5------------------------------------------------------------------------------
const snapdeal = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);


//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);

//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);


//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);

//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);

//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);

//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);



//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);


//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);

//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);


//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);

//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);

//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')

//6
const shopperstop = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);


//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);

//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);


//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);

//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);

//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);

//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);



//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);


//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);

//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);
//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);
//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);

//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')
//7
const clubfactory = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);
//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);
//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);
//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);
//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);
//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);
//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);
//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);
//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);
//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);
//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);
//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);
//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')
//8
const shopclues = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);
//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);
//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);
//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);
//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);
//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);
//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);
//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);
//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);
//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);
//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);
//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);
//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')
//9--------------
const groffers = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);
//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);
//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);
//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);
//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);
//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);
//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);
//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);
//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);
//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);
//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);
//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);
//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')
//10-----------------
const crazendemand = ['cloths', 'accessories', 'gadgets', 'shoe', 'toys']
//using for each with fuction
flipkart.forEach(function (value, index) {
    console.log('items of flipkart =', value);
}
);
//using isArray
const checkArray = Array.isArray(flipkart)
console.log('flipkart array or not?', checkArray);
//using include
const hasShoe = flipkart.includes('shoe')
console.log(' shoe is present or not?', hasShoe);
//using push
flipkart.push('home', 'furniture')
console.log(' add two items', flipkart);
//using pop
flipkart.pop('toys')
console.log(' remove items', flipkart);
//using shift
flipkart.shift()
console.log(' remove first index items', flipkart);
//using unshift
flipkart.unshift('beauty', 'sports')
console.log(' add two in first index items', flipkart);
//using splice
flipkart.splice(1, 2, 'book', 'flights');
console.log(' remove and then add two in first index items', flipkart);
//using slice
const remove = flipkart.slice(1, 2);
console.log(' remove and then add two in first index items', flipkart);
console.log('after remove and adding from slice first index', remove);
//using join
const joining = flipkart.join('-')
console.log('using separator in array', joining);
//using indexof
const indexing = flipkart.indexOf('book', 0)
console.log('search element in array', indexing);
//using map
const price = [100, 200, 300, 400]
const price1 = price.map(function (value, index) {
    let newValue = value + 50
    return newValue
})
console.log('after mapping', price1);
//using filter
const price3 = price.filter(function (value, index) {
    if (value > 250) {
        return true
    }
    else {
        return false
    }
}
)
console.log('after mapping', price3);
console.log('=================================================================')


