<script>
    import { Styles,Col, Container, Row, Button, Modal, ModalBody, ModalFooter, Spinner,
        TabPane,TabContent,Alert, Table} 
    from 'sveltestrap';
    import Card from "sveltestrap/src/Card.svelte";


let a=0
let b=0
let c=0
let d=0

</script>
<div style="height:30px"></div>

<Container>
    <Row>
        <Col>
            <Card>
                <input type=range bind:value={a} min=0 max=10 step=0.1>
            </Card>
        </Col>
        <Col>
            <Card>
                <input type=range bind:value={b} min=0 max=10 step=0.1>
            </Card>
        </Col>
        <Col>
            <Card>
                <input type=range bind:value={c} min=0 max=10 step=0.1>
            </Card>
        </Col>
        <Col>
            <Card>
                <input type=range bind:value={d} min=0 max=10 step=0.1>
            </Card>
        </Col>
    </Row>





</Container>
<style>
    input{
        left: 30px;
        max-width: 100px;
    }

</style>