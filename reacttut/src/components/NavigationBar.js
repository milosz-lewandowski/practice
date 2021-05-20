import React from "react";
import {Navbar, Nav, NavDropdown, } from "react-bootstrap";
import {LaunchTechDetailsModal} from "./TechnicalDetails";


export class NavigationBar extends React.Component{
    render() {
        return(
            <Navbar bg="light" expand="lg" >
                <Nav className="justify-content-center">
                        <NavDropdown title="About me" id="basic-nav-dropdown">
                            {/*<NavDropdown.Item href="https://miloszlewandowski.pl/justhappened">JustHappened description</NavDropdown.Item>*/}
                            <NavDropdown.Item href="#link" >My resume</NavDropdown.Item>
                            <NavDropdown.Divider />
                            <NavDropdown.Item href="#link">JP2 GMD Memes [HOT]</NavDropdown.Item>
                            {/*<NavDropdown.Item href="https://miloszlewandowski.pl/index">Previous static page</NavDropdown.Item>*/}
                            {/*<NavDropdown.Item href="https://miloszlewandowski.pl/therapists">Rest API</NavDropdown.Item>*/}
                            {/*<NavDropdown.Item onClick={LaunchTechDetailsModal}>Technical details</NavDropdown.Item>*/}
                        </NavDropdown>
                    </Nav>
                    {/*<Nav.Link href="#link" >My resume</Nav.Link>*/}
                    {/*<Nav.Link href="#link" >My resume</Nav.Link>*/}
                    <Nav.Link href="https://miloszlewandowski.pl/therapists">Rest API</Nav.Link>
                    <Nav.Link href="https://miloszlewandowski.pl/justhappened">JustHappened</Nav.Link>
                    <Nav.Link href="https://miloszlewandowski.pl/index">miloszlewandowski.pl</Nav.Link>
                    {/*<Nav.Link href="#home">About me</Nav.Link>*/}
            </Navbar>
        )
    }
}