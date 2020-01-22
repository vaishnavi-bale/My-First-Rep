"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(id_no, ename, doj) {
        this.id = id_no;
        this.name = ename;
        this.doj = doj;
    }
    Employee.prototype.display = function () {
        console.log('ID Number : ' + this.id);
        console.log('Name : ' + this.name);
        console.log('DOJ : ' + this.doj);
    };
    return Employee;
}());
exports.Employee = Employee;
var emp = new Employee(104, 'vaish', new Date);
emp.display();
