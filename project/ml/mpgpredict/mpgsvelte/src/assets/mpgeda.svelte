<script>
import { Styles,Col, Container, Row, Button, Modal, ModalBody, ModalFooter, Spinner,
        TabPane,TabContent,Alert, Table} from 'sveltestrap';
import dataimage from '../image/dataimage.png'
let d=new Date()

let columns=['mpg', 'cylinders', 'displacement', 'horsepower', 'weight',
       'acceleration', 'model_year', 'origin', 'name']
let values=''
async function check(){
    values=document.getElementById('select1').value
}
let selectcol=''
let columns1
function check1(){
    selectcol=document.getElementById('select2').value
    columns1=columns.filter(i=>i!=selectcol)
}
let selectcol2='null'
function check2(){
    selectcol2=document.getElementById('select2').value
}
$:console.log({values},{selectcol},{selectcol2})


function start(){
    let site='http://127.0.0.1:5000/plot/'+values+'_'+selectcol+'_'+selectcol2
    const res=fetch(site)

    setTimeout(()=>toggles(),1500)
}

function toggles(){
    const k=document.getElementById('images1')
    k.setAttribute('src',dataimage+'?'+d.getTime())
}


</script>
<div id='head'>
<div id='part'>
<select id='select1' on:change={check}>
    <option selected></option>
    <option id='option' value='count'>countplot</option>
    <option id='option' value='box'>boxplot</option>
    <option id='option' value='cat' >catplot</option>
</select>
</div>


{#if values.length>0}
<div id='part'>
    <select id='select2' on:change={check1}>
        <option selected></option>
        {#each columns as col}
            <option id='option1' value={col}>{col}</option>
        {/each}    
    </select>
</div>
{/if}


{#if (selectcol.length>0)&&(values!='count')}
<div id='part'>
    <select id='select3' on:change={check2}>
        <option selected></option>
        {#each columns1 as col}
            <option id='option2' value={col}>{col}</option>
        {/each}    
    </select>
</div>
{/if}
</div>

<button on:click={start}>실행</button>

<img id='images1' on:load={import('../image/dataimage.png')}/>

<style>
    #head{
        height:50px;
    }
    #part{

        float: left;
        width:200px
    }

</style>