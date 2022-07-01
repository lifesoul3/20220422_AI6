//answer 1
function multiplyAll(n,m){
    let num=1
    for(let i=n;i<=m;i++){
        num=num*i
    }
    return num;
}

// console.log(multiplyAll(1,2))
// console.log(multiplyAll(1,3))

//answer 2

const max=function([...array]){
    let output=array[0]
    array.sort((a,b)=>a-b)

    for(const item of array){
        console.log(item)
    }

    console.log("out put은 "+output)
}

// console.log(max([9,7,6,3,8]))

const max1=function(...array){
    let output=array[0]
    
    for(const item of array){
        console.log(item)
    }
    return output
}

console.log(`${max1([4,5,7,9,2])}`)
console.log(`${max1(4,5,7,9,2)}`)

