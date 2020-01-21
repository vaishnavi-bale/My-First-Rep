var arr=new Array(10)
for(let index=0;index<arr.length;index++){
    arr[index]=Math.floor(Math.random()*100)
}
let fil=arr.filter((x)=>x%2==0 && x%5==0)
console.log("filtered values: "+fil)
let inc=arr.map((x)=>parseInt(x*1.1))
console.log("increamented values :" +inc)