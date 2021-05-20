import React from "react";
import {Navbar, Nav, NavDropdown, } from "react-bootstrap";
import {LaunchTechDetailsModal} from "./TechnicalDetails";


export class NavigationBar extends React.Component{
    render() {
        return(
            <Navbar bg="light" expand="lg" >
                <Nav className="justify-content-center">
                        <NavDropdown title="My projects" id="basic-nav-dropdown">
                            <NavDropdown.Item href="https://miloszlewandowski.pl/justhappened">JustHappened description</NavDropdown.Item>
                            <NavDropdown.Divider />
                            <NavDropdown.Item href="https://miloszlewandowski.pl/index">Previous static page</NavDropdown.Item>
                            <NavDropdown.Item href="https://miloszlewandowski.pl/therapists">JustHappened Therapists API test</NavDropdown.Item>
                            {/*<NavDropdown.Item onClick={LaunchTechDetailsModal}>Technical details</NavDropdown.Item>*/}
                        </NavDropdown>
                    </Nav>
                    <Nav.Link href="#link" >My resume</Nav.Link>
                    <Nav.Link href="#home">About me</Nav.Link>
            </Navbar>
        )
    }
}