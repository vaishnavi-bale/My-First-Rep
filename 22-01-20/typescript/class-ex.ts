export class Employee{
    id: number;
    name: string;
    doj: Date;
    constructor(id_no: number, ename: string ,doj:Date){
        this.id=id_no;
        this.name=ename;
        this.doj=doj;
    }
    display(){
        console.log('ID Number : '+this.id);
        console.log('Name : '+this.name);
        console.log('DOJ : '+this.doj);
    }
}
let emp=new Employee(104,'vaish',new Date);
emp.display();