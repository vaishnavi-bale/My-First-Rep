function identity<T>(arg : T) : T{
    return arg;
}
let output=identity<string>("myString");
console.log(output);
let output1=identity("myString");
console.log(output1);
let output2=identity(5);
console.log(output2);