
//calls=print
// function callThreeTimes(calls){
//     for(let i=0;i<3;i++){
//         calls(i)
//     }
// }

// function print(i){
//     console.log(`${i}번째 함수 호출`)
// }

// callThreeTimes(print)


//위의 두문장을 하나로 합쳐보자


// callThreeTimes(function(i){
//     console.log(`${i} 이거머임`)
// })


// const numbers=[11,23,442,2,55,34]

// numbers.forEach(function(value,index,array){
//     console.log(`${index}번째: ${value}`)
// })


    // let count=0
    // setInterval(()=>{
    //     console.log(count)
    //     count++
    // },1*1000)

let user

user=function(){
    console.log("first")
}
user()
user()
