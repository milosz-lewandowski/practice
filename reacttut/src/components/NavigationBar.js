import React from "react";
import {Navbar, Nav, NavDropdown, Form, FormControl, Button, NavLink, NavItem} from "react-bootstrap";


export class NavigationBar extends React.Component{
    render() {
        return(
            <Navbar bg="light" expand="lg" >

                <Nav className="justify-content-center">
                        <NavDropdown title="My projects" id="basic-nav-dropdown">
                            <NavDropdown.Item href="https://miloszlewandowski.pl/justhappened">JustHappened description</NavDropdown.Item>
                            <NavDropdown.Divider />
                            <NavDropdown.Item href="https://miloszlewandowski.pl/">Previous static page</NavDropdown.Item>
                            <NavDropdown.Item href="https://miloszlewandowski.pl/therapists">JustHappened Therapists API test</NavDropdown.Item>
                            <NavDropdown.Item href="#action/3.3">Technical details [TODO]</NavDropdown.Item>
                        </NavDropdown>

                    </Nav>
                    <NavItem href="#link">My resume</NavItem>
                    <NavItem  href="#home">About me</NavItem>
            </Navbar>
        )
    }
}