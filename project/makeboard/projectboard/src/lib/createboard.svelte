<script>
import { onMount } from "svelte";

function enter(event){
    if(event.keyCode==13){
        event.returnValue=false;
    }
}
let categories=[]
    const categorieshost="http://localhost:8080/category"
    onMount(async()=>{
        const res=await fetch(categorieshost)
        const data=await res.json()
        categories=data._embedded.categories
    })
let board=[]
const boardhost="http://localhost:8080/boards"
onMount(async()=>{
    const res=await fetch(boardhost)
    const data=await res.json()
    board=data._embedded.board
})
    //code,title,contents
    let code=101;
    let title=""
    let contents=""
    let date=new Date()
    let regdate=date.toLocaleString()
    async function submit(){ 
        if(title==""){
            alert("제목을 작성하세요")
        }
        if(contents==""){
            alert("내용을 작성하세요")
        }
        else{
        const newboard={
            code:code,
            title:title,
            contents:contents,
            regdate:regdate
        }
        await fetch(boardhost,{
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            },
            body:JSON.stringify({
                code:newboard.code,
                title:newboard.title,
                contents:newboard.contents,
                regdate:newboard.regdate
            })
        })

    }
    }
    
</script>

<textarea id=title on:keydown={enter} bind:value={title}></textarea>
<select bind:value={code}>
    {#each categories as category}
    <option value={category.code}>{category.category}</option>
    {/each}
</select>

<button id=submit on:click={submit}><a href="/{code}" id=href>확인</a></button>
<textarea id=contents bind:value={contents}></textarea>
<style>
textarea{
    resize: none;
}
#title{
    border:1;
    font-size: 1.5em;
    height:30px;
}
#contents{
    width:590px;
    height:300px;
    border:1;
}
select{
    position: absolute;
    top:1px;
    right:220px;
    font-size: 1.5em;
}
#submit{
    position: absolute;
    top:10px;
    right:20px;

}
</style>