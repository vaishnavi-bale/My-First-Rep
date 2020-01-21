/*var asyncronousFunction=function(){
    return new Promise(Function(resolve,reject){
        console:log('keep every promise you make and only make promises that you can)
        setTimeout
    })
}*/
const myPromise= new Promise((resolve,reject) => {
    if(Math.random()*100<=90){
        resolve('hello,promise');
    }
    reject(new Error('in 10% of the cases,it fails'));
});
const onResolved=(resolvedValue)=> console.log(resolvedValue);
const onRejected=(error)=>console.log(error);
myPromise.then(onResolved,onRejected);