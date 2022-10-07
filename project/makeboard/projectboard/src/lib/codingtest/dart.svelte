<script>
//* == *2 , # == -
//  1S2D*3T	37 1+2제곱*2+3세제곱
//2 8 27==
//  1D2S#10S	9
//1 -2 10=9
//  1D2S0T	3
//1 2 0=3	
//Single(S), Double(D), Triple(T)

let dartresult="1D2S3T*"

function solution(dartresult){
  let answer=0
  for(let i=0;i<dartresult.length;i++){
    let shap=0
    if(dartresult[i]+1>0){}
    else{
        console.log(dartresult[i]+" this is string")
        if(dartresult[i]=="S"){
          answer=answer+S(Number(dartresult[i-1]))
          shap=S(Number(dartresult[i-1]))
        }
        if(dartresult[i]=="T"){
          answer=answer+T(Number(dartresult[i-1]))
          shap=T(Number(dartresult[i-1]))
        }
        if(dartresult[i]=="D"){
          answer=answer+D(Number(dartresult[i-1]))
          shap=D(Number(dartresult[i-1]))
        }
        if(dartresult[i]=="*"){
          answer=answer*2
        }
        if(dartresult[i]=="#"){
          answer=answer-(shap*2)
        }
      }   
    }     
    console.log(answer)
    return answer
  }


solution(dartresult)
function S(a){
  return a
}
function D(a){
  return a*a
}
function T(a){
  return a*a*a
}


</script>
<style>


</style>