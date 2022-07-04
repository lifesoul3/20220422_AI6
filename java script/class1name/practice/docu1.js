
//a1h1

function docu1(){
    // const back=document.getElementById("back")
    // back.style.width="1000px"
    // back.style.height="800px"
    
    // back.style.position="ebsolute"
    // back.style.border="2px solid black"
    // const b1=document.getElementById("b")    
    // b1.style.height="50px"
    // b1.style.width="50px"
    // b1.style.position="relative"
    // b1.style.background="black"

    //left up down
    //top up down
    
    // for(let i=0;i<1000;i++){
    //     const k=(i+1)*2
    //     setInterval(() => {
    //         b1.style.left=(k*2)+"px"
            
    //         b1.style.top=(k*2)+"px"
    //     },(i+1)*100)
    // }


    const header1=document.createElement("h1")
    header1.textContent="문서 객체 동적으로 생성하기"
    //header1.setAttribute("class","header1")
    header1.style.color="red"

    document.getElementById("adiv").appendChild(header1)


    const first=document.getElementById('first')
    const second=document.getElementById('second')
    first.style.padding="10px"
    second.style.padding="10px"
    const header2=document.createElement("h1")
    header2.textContent="시작"

    // const firsts=()=>{
    //     first.appendChild(header2)
    //     setTimeout(seconds,1000)
    // }

    // const thrid=()=>{
    //     header2.parentNode.removeChild(header2)
    // }
    // const seconds=()=>{
    //     second.appendChild(header2)
    //     setTimeout(thrid,1000)
    // }
    // firsts()

    // const h1=document.querySelector('button')
    // let count=0
    // h1.addEventListener('click',(event)=>{
    //     count++
    //     h1.textContent="click:"+count
    // })


    const textarea=document.querySelector('textarea')
    const h2=document.getElementById('hh1')
    textarea.style.width='500px'
    textarea.style.height='100px'
    h2.textContent='글자수:0'
    textarea.addEventListener('keyup',(event)=>{
        const length=textarea.value.length
        h2.textContent=`글자수:${length}`
        
        textarea.style.color="red"
        textarea[2].style.color='black'
    })

    const str='안녕하세요'

    const mains=document.getElementById('mains')
    mains.textContent=str

}
docu1()