<script>
  import { onMount } from "svelte";
  import {Router,Route,Link} from "svelte-routing";
  import Contents from "./lib/Contents.svelte";
  import Createboard from "./lib/createboard.svelte";
  export let url=""
  export let url1=""   
  let categories=[]
  const categorieshost="http://localhost:8080/category"
  onMount(async()=>{
    const res=await fetch(categorieshost)
    const data=await res.json()
    categories=data._embedded.categories
    })
</script>
<div id=main>
  <Router url={url1}>
  <div id=head>
    <h1 id=title>게시판만들기</h1>
    <div id=create>
    <Link to=createboard>게시글생성</Link>
  </div>
  </div>
  <div id=center>
    <Router url={url}>
      <div id=side>
        {#each categories as category}
        <div>
          <Link to={String(category.code)}><h1> {category.category}</h1></Link>
        </div>
        {/each}
      </div>
      <div id=contents>
      <Route path=createboard><Createboard/></Route>
      {#each categories as category}
        <Route path={String(category.code)}><Contents/></Route>
      {/each}
    </div>
  </Router>
  </div>
  </Router>
  </div>
  
  <style>
    #create{
      position: absolute;
      height:40px;
      top:10px;
      right:10px;
    }
    #main{
      width:850px;
      margin:auto;
      border:1px solid black;
      overflow: auto;
    }
    #head{
      position:relative;
    }
    #side{
      width:200px;
      border:1px solid black;
      margin:0px;
      float: left;
    }
    #contents{
      width:600px;
      border:1px solid black;
      margin:0px;
      float:right;
      min-height:200px;
    }
    #center{
      position: relative;
    }
    #title{
      text-align: center;
    }
  </style>