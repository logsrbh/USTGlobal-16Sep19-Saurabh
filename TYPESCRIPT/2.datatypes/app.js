var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "Michal";
console.log(myName, typeof myName);
var age;
console.log(age, typeof age);
var mobileNumber = "9976543210";
console.log(mobileNumber, typeof mobileNumber);
var address;
console.log(address, typeof address);
address = 9876543210;
console.log(address, typeof address);
var calAge = function () {
    console.log("Age is 26");
};
calAge();
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var person1 = new person("Mike", 27);
console.log(person1);
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, num) {
        var _this = _super.call(this, name, age) || this;
        _this.num = num;
        return _this;
    }
    return student;
}(person));
var student1 = new student("John", 26, 9876543210);
console.log(student1);
