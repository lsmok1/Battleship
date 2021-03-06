import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Battleship extends Ship {
    boolean placed = false;
    @Override
    void placeShip(char[][] gameBoard, int size, char symbol, String shipCoordinate, char vertHor) {

        //iterates thru the size of the ship, gets the numeric value of the 2nd char in the coordinates
        for (int i = 1; i <= size; i++) {

            //takes the numeric value of the 2nd char in string and adds i
            int horizontalPlacement = Character.getNumericValue(shipCoordinate.charAt(1)) + i - 1;
            //if horizontalPlacement > 6
            if (horizontalPlacement > 6 && Character.getNumericValue(shipCoordinate.charAt(1)) > 6 &&  vertHor == 'h' || vertHor == 'H'){
//                System.out.println("Not a valid placement!");
                break;
            } else {
                //switch case for the first char in coordinates
                switch (shipCoordinate.charAt(0)) {
                    case 'a', 'A':
                        //switch case for horizontal or vert
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                gameBoard[1][horizontalPlacement] = symbol;
//                                shipPlacements.add(gameBoard);
//                                List A1H = Arrays.asList(i-1, horizontalPlacement);
//                                shipPlacements.add((java.awt.List) A1H);
                                placed = true;
                            }
                            case 'v', 'V' -> {
                                gameBoard[i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                placed = true;
                            }
                        }
                        //breaking after the first switch case so it doesn't iterate all the way down the board
                        break;
                    case 'b', 'B':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                gameBoard[2][horizontalPlacement] = symbol;
                                placed = true;
                            }
                            case 'v', 'V' -> {
                                gameBoard[1 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                placed = true;
                            }
                        }
                        break;
                    case 'c', 'C':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                gameBoard[3][horizontalPlacement] = symbol;
                                placed = true;
                            }
                            case 'v', 'V' -> {
                                gameBoard[2 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                placed = true;
                            }
                        }
                        break;
                    case 'd', 'D':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                gameBoard[4][horizontalPlacement] = symbol;
                                placed = true;
                            }
                            case 'v', 'V' -> {
                                gameBoard[3 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                placed = true;
                            }
                        }
                        break;
                    case 'e', 'E':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                gameBoard[5][horizontalPlacement] = symbol;
                                placed = true;
                            }
                            case 'v', 'V' -> {
                                gameBoard[4 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                placed = true;
                            }
                        }
                        break;
                    case 'f', 'F':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                gameBoard[6][horizontalPlacement] = symbol;
                                placed = true;
                            }
                            case 'v', 'V' -> {
                                gameBoard[5 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                placed = true;
                            }
                        }
                        break;
                    case 'g', 'G':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                gameBoard[7][horizontalPlacement] = symbol;
                                placed = true;
                            }
                        }
                        break;
                    case 'h', 'H':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                gameBoard[8][horizontalPlacement] = symbol;
                                placed = true;
                            }
                        }
                        break;
                    case 'i', 'I':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                gameBoard[9][horizontalPlacement] = symbol;
                                placed = true;
                            }
                        }
                        break;
                    default:
                        placed = false;
                        break;
                }
            }
        }

    }


}


