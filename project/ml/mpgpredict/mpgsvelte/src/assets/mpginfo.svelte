<script>
import image from '../image/image.png'

let a
let b
let d=new Date()
function start(){
    let site='http://127.0.0.1:5000/data/'+a+':'+b+':'
    const res=fetch(site)
    setTimeout(()=>toggles(),500)
}

function toggles(){
    const k=document.getElementById('images')
    k.setAttribute('src',image+'?'+d.getTime())
}
//
</script>


<h1 id='h1'>일단 data부터 불러와보자</h1>
<input type='text' bind:value={a}>
<input type='text' bind:value={b}>

<button on:click={start}>데이터 검색</button>

<img id='images' on:load={import('../image/image.png')}/>


<style>

</style>