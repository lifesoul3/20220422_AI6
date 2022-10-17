<script>
    //29,30=> 1*1의 길이에서 29/30만큼의 길이가 생성된다
    //          2열에서 29/30=>58/30으로 생성된다
    //          3열에서 87/30=>으로 생성
    //       ...30열에서870/30으로 생성
    //최소공배수화 문제 풀기
    //약분 하기
let k=32
let t=12
let array1=[]
let array2=[]
function solution(array,number) {
    for(let i=2;i<number;i++){
        console.log(number)
        if(number%i==0){
            number=number/i
            array.push(i)
            i=2
        }
    }
    array.push(number)
    console.log(array);
    
}
function datas(){
    solution(array1,k)
    solution(array2,t)
}
datas()
    </script>