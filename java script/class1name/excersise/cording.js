
//윤년 구하기

// let n=Number(prompt("현재의 연도를 입력해주세요"))
// years(n)
// function years(year){
//     if(Boolean(n)!=true){
//         fails()
//     }

//     else if(year%4==0){
//         trues(year)
//     }
//     else
//         falses(year)
// }
// function fails(){
//     console.log("수가 잘못됨")
// }
// function trues(n){
//     console.log(n+" 년도는 2월 29일까지있음")
// }
// function falses(n){
//     console.log(n+" 년도는 2월 28일까지있음")
// }


//n~m까지의 합구하기

// let n=Number(prompt("작은수"))
// let m=Number(prompt("큰수"))
// let k=n; let t=m;

// sums(k,t)

// function sums(N,M){
//     let result=0
//     for(let i=N;i<=M;i++){
//         result+=i
//     }
//     console.log(result)
    
// }

//5	[2,1,1,1,0,0,0,0,0,0,0]	[0,2,2,0,1,0,0,0,0,0,0]
//1	[1,0,0,0,0,0,0,0,0,0,0]	[-1]

//5발이 남아있고 점수차이는 만약 b가 맞춘상태라면 b가 못맞춘 상태라면 현재상황에서는발당
//10점을 위해 3발을 +20 +10 6.66 
//9점을 위해 2발을  +18 +9  9
//8점을 위해 2발을  +16 +8  8
//7점을 위해 2발을 +14 +7   7
//6점을위해 1발을 +12 +6    6   이중에 5발을 찾아라

// let a1=5
// let a2=[2,1,1,1,0,0,0,0,0,0,0]
// rank(a1,a2)
// function rank(a1,a2){
// //발당 점수 배열 생성
//     let b1=[]
//     for(let i=0;i<a2.length;i++){
//         let t=10-i
//         if(a2[i]>0){b1.push(t/(a2[i]+1)*2)}
//         else b1.push(t/(a2[i]+1))
//         console.log(b1[i])
//     }
//     let b2=[]
//     for(let i=0;i<a2.length;i++){
//     //가장 큰값을 찾아서 넣자    
//         let max=0    
//         if(b1[i]>max){max=b1[i]; i=0
        
//         }
        
//     }

//최솟값 만들기Page4

// let a1=[1, 4, 2]
// let b1=[5, 4, 4]

// ar(a1,b1)
// function ar(a1,b1){
//     a1.sort(function(a, b)  {
//         return a - b;
//     });
//     b1.sort(function(a, b)  {
//         return b-a;
//     });

//     let k=0
//     for(let i=0;i<a1.length;i++){
    
//         k+=(a1[i]*b1[i])
//     }
//     console.log(k)
// }

//n개의 퀸과 nX의 테이블
//배치가능한 경우의 수를 구하기


// let a=[1,3,7,5,6,8,34,5,3,5,6,78,4]
// for(const item of a){
//     //console.log(item)
// }
// a.sort((a,b)=>a-b)
// for(const item of a){
//     //console.log(item)
// }
// a.sort((a,b)=>b-a)
// for(const item of a){
//     console.log(item)
// }







