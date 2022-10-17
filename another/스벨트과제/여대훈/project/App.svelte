<script>
import {Router, Link, Route} from  "svelte-routing";    
import Deferred from "./project/Deferred.svelte";
import Todo from "./project/Todo.svelte";
  
export let url="";
</script>
  
  <Router url="{url}">
    <nav>
      <Link to="/">Todo</Link>
      <Link to="Deferred">Deferred</Link>    
    </nav>
    <div>
      <Route path="/"><Todo/></Route>
      <Route path="Deferred" component="{Deferred}"></Route>
    </div>
  </Router>
  
  <style>  
  </style>
  