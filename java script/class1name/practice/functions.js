
//24==윤년
// let n=Number(prompt("현재의 연도를 입력해주세요"))
// years(n)

// function years(year){

//     if(year%4==0){
//         trues(year)
//     }
//     else
//         falses(year)


// }
// function trues(n){
//     console.log(n+" 년도는 2월 29일까지있음")
// }
// function falses(n){
//     console.log(n+" 년도는 2월 28일까지있음")
// }

// function f1(...numbers){
//     let num=numbers[0]
//     for(const number of numbers){
//         if(num>number){
//             num=number

//         }
//     }
//     console.log(num)
// }
// // f1(2,5,66,4,3,74,21)

// function sample(...items){
//     console.log(items)

// }

// const array=[1,2,3,4]
// // sample(array)
// f1(array)
// // sample(...array)

function earnings(name,wags=1000,hour=100){
    console.log(`# ${name}님의 급여정보`)
    console.log(`- 시급은 ${wags}`)
    console.log(`- 근무시간 ${hour}`)
    console.log(`- 급여 ${wags*hour}원`)
}

// earnings("ff",100,20)
// earnings("fek")
// earnings("alpha",10000)
// console.log("alpha")



function texts(){
    console.log("텍스트작성됨")
}





