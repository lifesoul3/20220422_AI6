<script>
    function con(s){
        let t=0;
        t=s*100000000
        t=Math.round(t)
        t=t/100000000
        if(Number.isInteger(t)==true){
            return t;
        }
        else{
            return s;
        }
    }
    console.log(con(6))
    //2,3=>선분의 좌표를 측정하라
    //x축 세로 y축 가로
let x=8
let y=12
let array=[]
//8*12=96=>80=>16
function line(x,y){
    let k=0;
    console.log(0)
    for(let i=0;i<y;i++){
        k=con(k)
        console.log(k)
        array.push(Math.ceil(k+x/y)-Math.floor(k))
        k=k+x/y
        if(i+1==y){
            k=x
        }
    }
    console.log(array)
    console.log(array.reduce(function add(sum,array){
        return sum+array;
    },0))
}
//line(x,y)
</script>