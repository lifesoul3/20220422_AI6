// const fruit=['사과','배','바나나']

// function calls(callback){
//     for(let i=0;i<fruit.length;i++){
//         callback(i)
//     }
// }

// // function print(i){
// //     console.log(i)
// //     console.log(fruit[i])
// // }
// console.log("new")
// calls((a)=>{
//     console.log(a+" "+fruit[a])
// })


// nums.forEach((value,index,array)=>{
//     console.log(value+" "+index)
// })

// nums.sort((a,b)=>{return a-b})

// for(const i of nums){
//     console.log(i)
// }

// nums=nums.map((value)=>{
//     return value*2
// })
// for(const i of nums){
//     console.log(i)
// }
//make jasondata

// fetch("https://jsonplaceholder.typicode.com/posts")
// .then((aa)=>{
//     return aa.json()
// })
// .then((data1)=>{
//     for(let i=0;i<data1.length;i++){
//     console.log(data1[i].userId)
// }
// })

// //로또
//     fetch("https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=1000")
//     .then((a1)=>{
//         return a1.json()
//     })
//     .then((a1)=>{
//         console.log(a1)
//     })

//     const obj={number:273,string:'구름'}

//     console.log(typeof(obj))
//     console.log(typeof(obj.number))

//     const a=[]
//     console.log(typeof(a))

//     function b(){
//     }
//     console.log(typeof(b()))



//     console.log("restart")
//     const a1=new String(24)
//     console.log(a1)

// let n=Infinity
//     console.log(n)
//     console.log(typeof(n))

// let a1=`일자,달러,엔,유로
//     02,1141.8,1097.46,1262.37
//     03,1148.7,1111.36,1274.65
//     04,1140.6,1107.81,1266.58
//     07,1143.4,1099.85,1267.8`

// console.log(a1)
// a1=a1.trim()
// console.log(a1)
// a1=a1.split('\n')
// console.log(a1)
// a1=a1.map((line)=>line.split(','))
// console.log(a1)
// console.log(a1[2])
// a1=JSON.stringify(a1,null,2)
// console.log(typeof(a1))

// for(const i of a1){
//     console.log(i)
// }
// console.log(a1)

// let a1=[{"name":"혼자공부하는 파이썬",
//         "price":18000,
//         "publisher":"한빛미디어"},
//         {"name":"html5 입문용",
//         "price":25000,
//         "publisher":"한빛아카데미"
//     }]

//     for(let i=0;i<a1.length;i++){
//         console.log(a1[i].price)
//     }

//     const json=JSON.stringify(a1)
//     console.log(json)

//     console.log(JSON.parse(json))

//     let num=Math.random()


//     console.log(Math.floor(num*50))

    let ar=[0,0,0,0,0,0,0,0,0,0]
    
    // for(let i=0;i<1000;i++){
    // let num=Math.random()
    // let nums1=Math.floor(num*10)
    //     ar[nums1]=++ar[nums1]
    // }

    // for(const i of ar){
    //     console.log(i)
    // }
    //11 2 16
    //11 1 14
    for(let i=0;i<1000;i++){
        let num=Math.random()
        let nums1=Math.floor(num*10)
        ar[nums1]=ar[nums1]+1

    }

    for(const item of ar){
        console.log(item)
    }















