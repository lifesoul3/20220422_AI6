<script>
import Bodies from "./bodies.svelte";
import Text from "./texts.svelte";
import Router from "svelte-spa-router";
let  routes={
    '/':Bodies,
    '/:id':Text
  }
</script>
<Router {routes}/>

