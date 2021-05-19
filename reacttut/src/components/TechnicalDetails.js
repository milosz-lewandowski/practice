import React, {useState} from "react";
import {Button, Modal} from "react-bootstrap";

export class TechnicalDetails extends React.Component{
    render() {
        return(
            <ul>
                <li>This page is hosted on AWS Amplify cloud hosting</li>
                <li>Frontend uses React and React-Bootstrap</li>
                <li/>
                <li>Backend is written in Spring Boot</li>
                <li>Hosted on OVH VPS</li>
                <li>As database I use PostgreSQL databases</li>
                <li>Both Spring Boot application and Database are run in Docker containers</li>
            </ul>
        )
    }
}