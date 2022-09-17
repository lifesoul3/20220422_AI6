<script>
//[5, 9, 7, 10]	5	[5, 10]
//[2, 36, 1, 3]	1	[1, 2, 3, 36]
//[3,2,6]	10	[-1]
let arr=[3,2,6]
let divisor=10
function solution(arr,divisor) {
    let answer = [];
    for(let i=0;i<arr.length;i++){
        if(arr[i]/divisor>0&&arr[i]%divisor==0){
            answer.push(i)
        }
    }


    console.log(arr)
    
    return answer;
}
solution(arr,divisor)
</script>
