


// let str="안녕사세요"

// for(let i=0;i<str.length;i++){
//     console.log(str[i])
// }

// let array=[123,'string',true,function(){},{},[273,103]]
// for(let i=0;i<array.length;i++){
//     console.log(array[i])
//     console.log(typeof(array[i]))
//     console.log("")

// }

// const numbers=[273,52,103,32]
// numbers.push(114)
// numbers.push(223)
// numbers.splice(1,2)
// for(let i=0;i<numbers.length;i++){
//     console.log(numbers[i])
// }

const fruits=['배','키위','바나나','망고']
fruits[5]="오렌지"
fruits.push("레몬") //fruits[fruits.length]="레몬"


console.log(fruits.length)


console.log(fruits)

fruits.splice(4,1)
console.log(fruits)

console.log(fruits.indexOf('사과'))//없음 -1
console.log(fruits.indexOf('오렌지'))//있음 어디? 4번째 배열에

//바나나지워보기

console.log(fruits)
let i=fruits.indexOf('바나나')
fruits.splice(i,1)
console.log(fruits)

fruits.splice(3,0,'딸기')//중요
console.log(fruits)


for(const i in fruits){
    console.log(fruits[i])
}







