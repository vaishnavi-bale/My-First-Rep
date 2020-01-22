/*console.log('hello world');*/
function add(p : string,q : string) : string;
function add(x : number,y : number) : number;
function add(num1 : any,num2 : any) : any{
    return num1+num2;
}
var concat=add("TypeScript "," Function Overloading");
console.log(concat);

var sum=add(10,20);
console.log(sum);