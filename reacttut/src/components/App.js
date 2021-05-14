import React from "react";
import {Container, Row, Col} from "react-bootstrap";
import {Game} from "./Game";
import {NavigationBar} from "./NavigationBar";
import {Title} from "./Title";

export class App extends React.Component{
    render(){
        return(
            <Container>
                <Row>
                    <Col>
                        <Title />
                    </Col>
                </Row>
                <Row>
                    <Col>
                        <NavigationBar />
                    </Col>
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