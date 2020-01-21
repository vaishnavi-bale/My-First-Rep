promise=new Promise(function(resolve, reject){
    setTimeout(resolve,5000)
})
promise.then(function(){
    console.log("this is done")
})