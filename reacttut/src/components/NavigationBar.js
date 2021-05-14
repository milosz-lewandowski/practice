import React from "react";
import {Navbar, Nav, NavDropdown, Form, FormControl, Button} from "react-bootstrap";


export class NavigationBar extends React.Component{
    render() {
        return(
            <Navbar bg="light" expand="lg">
                {/*<Navbar.Brand href="#home">Miłosz Lewandowski</Navbar.Brand>*/}
                <Navbar.Toggle aria-controls="basic-navbar-nav">Menu</Navbar.Toggle>
                <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="mr-auto">
                        <Nav.Link href="#home">Kim jestem</Nav.Link>
                        <Nav.Link href="#link">Moje CV</Nav.Link>
                        <NavDropdown title="Moje projekty" id="basic-nav-dropdown">
                            <NavDropdown.Item href="#action/3.1">JustHappened</NavDropdown.Item>
                            <NavDropdown.Item href="#action/3.2">Another action</NavDropdown.Item>
                            <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
                            <NavDropdown.Divider />
                            <NavDropdown.Item href="#action/3.4"></NavDropdown.Item>
                        </NavDropdown>
                    </Nav>
                    {/*<Form inline>*/}
                    {/*    <FormControl type="text" placeholder="Search" className="mr-sm-2" />*/}
                    {/*    <Button variant="outline-success">Search</Button>*/}
                    {/*</Form>*/}
                </Navbar.Collapse>
            </Navbar>
        )
    }
}