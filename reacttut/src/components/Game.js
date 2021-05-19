import React from "react";
import {Board} from "./Board";
import { Button } from 'react-bootstrap';


export class Game extends React.Component {
    render() {
        return (
            <div className="game">
                <div className="game-board">
                    <Board />
                </div>
                    <Button
                        className={"restart-game-button"}
                    // onClick={this.state.restartGame}
                    >Restart game</Button>
                <div className="game-info">
                    <div>{/* status */}</div>
                    <ol>{/* TODO */}</ol>
                </div>
            </div>
        );
    }
    // restartGame(){
    //     this. = {squares: Array(9).fill(null),
    //         xIsNext: true,
    //     };
    // }
}