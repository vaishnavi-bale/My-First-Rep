class Fruit{
    constructor(name,quantity){
        this.name=name;
        this.quantity=quantity;
    }
    show(){
        console.log('parent class method');
    }
    display(){
        console.log('Name of the fruit is : '+this.name);
        console.log('quantity needed : '+this.quantity);
    }
    
}
class Apple extends Fruit{
show(){
    super.show();
    console.log('child class method');
}
}
let obj =  new Apple('mango',5);
obj.display();
obj.show();