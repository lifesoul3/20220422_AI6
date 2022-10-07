<script>
    import { onMount } from "svelte";
  
    let boards=[]
    let k=Number(location.pathname.slice(1,4))
    const boardshost="http://localhost:8080/board/"+k
    
          onMount(async()=>{
            const rest=await fetch(boardshost)
            const data=await rest.json()
            boards=data
        })

    </script>
   
     {#each boards.reverse() as board}
     <a href="#/{board.id}" ><h1>   {board.title}</h1></a>
      {/each}
     
    
    <style>
    </style>