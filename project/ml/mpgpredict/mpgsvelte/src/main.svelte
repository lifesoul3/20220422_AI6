<script>
    import { Styles,Col, Container, Row, Button, Modal, ModalBody, ModalFooter, Spinner,
        TabPane,TabContent,Alert, Table} 
    from 'sveltestrap';
    import Card from "sveltestrap/src/Card.svelte";
    import CardBody from "sveltestrap/src/CardBody.svelte";
    import CardHeader from "sveltestrap/src/CardHeader.svelte";
    import CardFooter from "sveltestrap/src/CardFooter.svelte";
    import Info from "./assets/mpginfo.svelte";
    import Predict from "./assets/mpgpredict.svelte";
    import Eda from "./assets/mpgeda.svelte";
    
//실행과 함께 데이터 로딩


</script>
<Styles/>
<Container>
    <Row  class="mt-4">
      <Col>
      <Card body>
          <h1 class="fw-bolder">MPG 분석</h1>
      </Card>
      </Col>
    </Row>
    <TabContent class="mt-4">
        <TabPane tabId="Info" tab="Data 정보">
            <Info/>
        </TabPane>
        <TabPane tabId="Eda" tab="Data 분석" active>
            <Eda/>
        </TabPane>
        <TabPane tabId="Predict" tab="MPG 예측">
            <Predict/>
        </TabPane>
    </TabContent>
</Container>


<style>

</style>