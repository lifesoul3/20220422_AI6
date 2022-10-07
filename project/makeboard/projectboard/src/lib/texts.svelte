<script>
// @ts-nocheck
import { onMount } from "svelte";

    export let params;
    let board=[]
    const boardid="http://localhost:8080/boardid/"+params.id
    onMount(async()=>{
        const res=await fetch(boardid)
        board=await res.json()
    })

async function remove(board){
    await fetch("http://localhost:8080/boards/"+params.id
    ,{method:"DELETE"})

}


</script>
<div id=heads>
<h1 id=head>제목 :</h1>
<h1 id=title>{board.title}</h1>
<p id=regdate>{board.regdate}</p>
</div>
<br>
<p id=contents>{board.contents}</p>
<button on:click="{remove(board)}" id=delete><a href={location.pathname}> 삭제</a></button>

<style>
    #delete{
        float:right;
        top:20px;
    }
    #heads{
        height:43px;
    }
    #head{
        float: left;
    }
    #title{
        float:left;
    }
    #regdate{
        float:right;
    }
    p{
        font-size: 1.5em;
    }
</style>