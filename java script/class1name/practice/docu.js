
//html(요소)테그=scrpit(문서 객체)(DOM:document objects model)


document.addEventListener("DOMContentLoaded",()=>{

const firsth1=document.getElementById("FirstH1").innerText="hello DOM "
    document.getElementById("FirstH1").innerText+="hello DOM "

})


function chapters(){
    const header=document.querySelector("h1")
    header.innerText="headers"
    header.style.color="blue"
    header.style.background="pink"
    header.style.padding="10px"
   
    // const headers=document.querySelectorAll("h1")
    // headers.forEach((header)=>{
    //     header.innerText="headers"
    //     header.style.color="green"
    //     header.style.background="pink"
    //     header.style.padding="20px"
            
    // })
    
    const h2s=document.getElementsByClassName("h2s")
       console.log(h2s)
       for(const h2 of h2s){
        h2.textContent="this is"
    }
    h2s[0].style.color="red"
    h2s[1].style.color="blue"
    h2s[2].style.color="RGB(80, 181, 129)"
    
    
    
    const a=document.querySelector('#a')
    const div2=document.getElementById("b")

    //textcontent 문자 전체를 출력
    a.textContent="<h1>his</h1>"
    //innerHTML 문자내부의 태그사용
    b.innerHTML="<h1>world</h1>"
    
    const rects=document.querySelectorAll(".rect")
        rects.forEach((rect,index)=>{
            const width=(index+1)*100
            const height=(index+1)*50
            const src=`http://placekitten.com/${width}/${height}`
            rect.setAttribute("src",src)  
        })

    const rects1=document.getElementById("rect1")
        console.log(rects1.getAttribute("src"))
        console.log(rects1.getAttribute("alt"))
        //style control

    const sty1=document.getElementById("styles")

        for(let i=0;i<100;i++){
            const k=(i+1)*2
            setTimeout(()=>{
                sty1.style.backgroundcolor="rgba(${k},${k},${k})"
            },(i+1)*500)
        }
        sty1.style.padding="30px"
        sty1.style.background="black"
        sty1.innerHTML="<h1>hi</h1>"
        sty1.style.textAlign="center"

    //문서객체 생성 요소 생성
    const header1=document.createElement("h1")
    header1.textContent="문서 객체 동적으로 생성하기"
    header1.setAttribute("class","header1")
    header1.style.color="red"

    document.getElementById("adiv").appendChild(header1)
    
    //문서객체 이동
        const header2=document.createElement("h2")
        header2.textContent="이동하는 테그"
        const divF=document.getElementById("first")
        divF.appendChild(header2)
        const divS=document.getElementById("second")
        
    //     setTimeout(() => {
    //         divS.appendChild(header2)
    //     }, 2000)

    // //요소 삭제
    //     setTimeout(() => {
    //         //header2.parentNode.removeChild(header2)
    //         divS.removeChild(header2)
    //     }, 3000)

        const b1=document.getElementById("b1")
        let counts=0
        const list=(event)=>{
            counts++
            b1.textContent='count:'+counts
        }
        b1.addEventListener("click",list)        
        setTimeout(()=>{
            b1.removeEventListener("click",list)
        },1000)








}
chapters()




