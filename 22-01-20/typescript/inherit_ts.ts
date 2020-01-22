class Parent{
    drink(): void{
        console.log('drink milk');
    }
}
class Child extends Parent{
    drink(): void{
        super.drink();
        console.log('i want juice');
    }
}
let obj=new Child();
obj.drink();