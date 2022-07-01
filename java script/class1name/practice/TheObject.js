

//객체=배열,함수,기본타입들
//자바- 인스턴스 느낌


//(:)가 들어가면 앞의 단어는 참조key가 됨
const product={
    prodname:'7d dry mango',
    type:'sugared',
    ingredient:['mango','sugar','metanatreum','yellowcolored'],
    origin:'phillip',
    price:3900,
    "with space":'hi',
    "123":430
}

console.log(product.prodname)
console.log(product.type)
for(const item of product.ingredient){
    if(item.indexOf('meta')==0)
    console.log(item)
}

console.log(product.origin)
console.log(product.price)
console.log(product["with space"])
console.log(product["123"])

{
const pet={
    name:'cloud',
    eat:function(food){
        console.log(this.name+'은 '+food+'를 먹습니다')
    }
}
pet.eat('밥')
}

const student={}
    student.name='윤인성'
    student.hobby='악기'
    student.toBe="sg.wannbe"
    



console.log(student)
delete student.hobby

console.log(student)

const a=[]
a.sample=10
console.log(typeof(a))

function b(){
}
b.sample=10


console.log(typeof(b.sample))
console.log(b.sample)


if(Array.isArray(a)){
    console.log("hkdl")
}

function c(callback){
    if(typeof(callback)==="function"){
        console.log("함수임")
    }
    else console.log("함수아님")
}

//Array.isArray(a)=>true로 반환
c(b)
c(a)



//객체에 속성 추가

// const c=273

// c.sample=10

// console.log(c)
// console.log(c.sample)

const d=new Number(273)
d.sample=10
d.alpha="this"
console.log(d)
console.log(d.sample)

console.log(2**8)


//prototype
Number.prototype.power=function(n=2){
    return this.valueOf()**n
}

const nums2=12
console.log(nums2.power(4))

const nums3=new Number(3)
console.log(nums3)

//숫자 n번째 자릿수까지 출력하는 메소드
let num=Math.random()*100
console.log(num.toFixed(5))

let num1=4
let num2="a5"
num1=num2/num1
console.log(num1)
if(Number.isNaN(num1)){
    console.log("Nan이다")    
}
else console.log(num1)


const num5=1/0
    console.log(num5)

const num6=1
    console.log(num6)

console.log(Number.isFinite(num5))//무한시 false
console.log(Number.isFinite(num6))//유한시 true

console.log(num5===Infinity)//무한시 true

//문자열 양쪽 끝의 공백제거 trim


let str1='       하이'
console.log(str1)
console.log(str1.trim())

let a1=`일자,달러,엔,유로       
    02,1141.8,1097.46,1262.37
    03,1148.7,1111.36,1274.65
    04,1140.6,1107.81,1266.58
    07,1143.4,1099.85,1267.8`
console.log(a1)
a1=a1.split('\n')
console.log(a1)
for(let i=0;i<a1.length;i++){
    a1[i]=a1[i].trim()
}
console.log(a1)


a1=JSON.stringify(a1,null,2)

console.log(a1)
//json에 들어갈수 있는값 문자열,숫자,불
//      문자열은 무조건""
//      키 반드시""
//배열[index],객체["key"]
const books=[
    {
        "name":"혼자공부하는 파이썬",
        "price":18000,
        "publisher":"한빛미디어"
    },
    {
        "name":"html5 입문",
        "price":26000,
        "publisher":"한빛아카데미"
    }
]

console.log(books[1].name)






















