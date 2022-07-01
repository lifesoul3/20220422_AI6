
// const fruit=['사과','바나나','자몽','오렌지']


// function callThreeTimes (callback){
//     for(let i=0;i<fruit.length;i++){
//         callback(i)
//     }
// }

// // function print (i){
// //     console.log(`${i}번째 실행`)
// // }

// // callThreeTimes(function (a){
// //     console.log(fruit[a])
// // })

// callThreeTimes((a)=>{//a의 소괄호 생략도 가능
//     console.log(fruit[a])
// })
// //화살표함수

// let nums=[9,1,4,5,7,2,3,6,8]
// //a내부값 b인덱스 c배열자체
// nums.forEach((a,b,c)=>{
//     console.log(a)
// })
// //내림차순

// console.log("")
// nums.sort((a,b)=>{return a-b})

// nums.forEach(a=>{
//     console.log(a)
// })

// for(const item of nums){
//     console.log(item)
// }

// nums=nums.map((a,b)=>{
//     return a*a
// })

// nums.forEach(console.log)


// for(const item of nums){
//     console.log(item)
// }

// //filter 리턴을 통해 조건에 맞는 새로운 배열을 만듬
// const evennums=nums.filter(a=>{
//     return a%2==0
// })

// for(const item of evennums){
//     console.log(item)
// }

// console.log(evennums)
// const neven=nums.filter(a=>{
//     return a%2!=0
// })
// for(const item of neven){
//     console.log(item)
// }
// console.log(neven)
    
    // //체이닝
    // const nums1=nums.filter(a=>{return a%2==0}).map(a=>{return a*a}).sort((a,b)=>{return a-b})
    
    // for(const item of nums1){
    //     console.log(item)
    // }

    //timer

    // let clear=setInterval(()=>{
    //     console.log("실행")
    // },1*1000)

    // setTimeout(() => {
    //     console.log("종료") 
    //      clearInterval(clear)
    //  }, 5*1000);


    //  (function(a){
    //     console.log(a)
    //  })
    //  (443)
 

    //비동기순서를 동기순서로 정하는법

    // function func1(callback){
    //     setTimeout(()=>{
    //         for(let i=0;i<3;i++){
    //             console.log("func1: "+i)
    //         }
    //         callback()
    //     },1000)
    // }

    // function func2(){
    //         for(let i=0;i<3;i++){
    //             console.log("func2: "+i)
    //         }
    // }

    // func1(func2)
   
    
    // function timer(time){
    //     return new Promise((a)=>{
    //         setTimeout(()=>{
    //             a(time)
    //         },time)
    //     })
    // }

    // // console.log("start")
    // timer(1000)
    // // .then((time)=>{
    // //     console.log(`${time}timer 실행`)
    // //     // console.log("end")
    // //     return timer(time+100)
    // // })

    // async function afunc(){
    // console.log("start")
    // let time=await timer(1000)
    // console.log(1+"초뒤 실행")
    // console.log("end")
    // time=await timer(1000)
    // console.log(2+"초뒤 실행")
    // console.log("end")
    // }   
    

    // fetch("https://jsonplaceholder.typicode.com/posts")
    // .then((response)=>{
    //     return response.json()
    // })
    // .then((data1)=>{
    //     console.log(data1)
    //     for(item in data1){
            
    //     }

    // })

    // let numbers=[273,25,75,52,103,32,57,24,76]

    // numbers=numbers.filter((value)=>{
    //     return value<=100
    // }).filter((value)=>{
    //     return value%2!=0
    // }).filter((value)=>{
    //     return value%5==0
    // })

    // console.log(numbers)



    // const a=[{id:'1',userid:'20'},{id:'2',userid:'25'}]
    
    // console.log(a[1].userid)
    // const b=[{"userId": 1,"id": 2},{"userId": 2,"id":3}]
    // console.log(b[0].id)
    
    console.log(c)