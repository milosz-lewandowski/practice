import React from "react";
import {Container, Row, Col} from "react-bootstrap";
import {Game} from "./Game";

export class App extends React.Component{
    render(){
        return(
            <Container>
                <Row>
                    <Col></Col>
                </Row>
                <Row>
                    <Col style={{textAlign: 'center', border: '1px solid black'}}>
                        <Game />
                    </Col>
                </Row>
            </Container>
        )
    }
}