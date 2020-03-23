public class Destroyer extends Ship {
    boolean placed = false;
    @Override
    void placeShip(char[][] gameBoard, int size, char symbol, String shipCoordinate, char vertHor) {
        //iterates thru the size of the ship, gets the numeric value of the 2nd char in the coordinates
        outer:
        for (int i = 1; i <= size; i++) {
            //takes the numeric value of the 2nd char in string and adds i
            int horizontalPlacement = Character.getNumericValue(shipCoordinate.charAt(1)) + i - 1;
            //if horizontalPlacement > 8
            if (horizontalPlacement > 8 && Character.getNumericValue(shipCoordinate.charAt(1)) > 8 &&  vertHor == 'h' || vertHor == 'H') {
//                System.out.println("Not a valid placement!");
                break;
            } else {
                //switch case for the first char in coordinates
                switch (shipCoordinate.charAt(0)) {

                    case 'a', 'A':
                        //switch case for horizontal or vert
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                if (gameBoard[1][horizontalPlacement] == 'b' || gameBoard[1][horizontalPlacement] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[1][horizontalPlacement] == '~' && gameBoard[1][horizontalPlacement] != 'b' && gameBoard[1][horizontalPlacement] != 'c'){
                                    placed = true;
                                    gameBoard[1][horizontalPlacement] = symbol;
                                }
                            }
                            case 'v', 'V' -> {
                                if (gameBoard[i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'b' || gameBoard[i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[i][Character.getNumericValue(shipCoordinate.charAt(1))] == '~' && gameBoard[i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'b' && gameBoard[i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'c'){
                                    placed = true;
                                    gameBoard[i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                }

                            }
                        }
                        //breaking after the first switch case so it doesn't iterate all the way down the board
                        break;
                    case 'b', 'B':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                if (gameBoard[2][horizontalPlacement] == 'b' || gameBoard[2][horizontalPlacement] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[2][horizontalPlacement] == '~' && gameBoard[2][horizontalPlacement] != 'b' && gameBoard[2][horizontalPlacement] != 'c') {
                                    placed = true;
                                    gameBoard[2][horizontalPlacement] = symbol;
                                }
                            }
                            case 'v', 'V' -> {
                                if (gameBoard[1 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'b' || gameBoard[1 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[1 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == '~' && gameBoard[1 + i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'b' && gameBoard[1 + i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'c') {
                                    placed = true;
                                    gameBoard[1 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                }
                            }
                        }
                        break;
                    case 'c', 'C':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                if (gameBoard[3][horizontalPlacement] == 'b' || gameBoard[3][horizontalPlacement] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[3][horizontalPlacement] == '~' && gameBoard[3][horizontalPlacement] != 'b' ) {
                                    placed = true;
                                    gameBoard[3][horizontalPlacement] = symbol;
                                }
                            }
                            case 'v', 'V' -> {
                                if (gameBoard[2 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'b' || gameBoard[2 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[2 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == '~' && gameBoard[2 + i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'b') {
                                    placed = true;
                                    gameBoard[2 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                }
                            }
                        }
                        break;
                    case 'd', 'D':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                if (gameBoard[4][horizontalPlacement] == 'b' || gameBoard[4][horizontalPlacement] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[4][horizontalPlacement] == '~' && gameBoard[4][horizontalPlacement] != 'b' ) {
                                    placed = true;
                                    gameBoard[4][horizontalPlacement] = symbol;
                                }
                            }
                            case 'v', 'V' -> {
                                if (gameBoard[3 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'b' || gameBoard[3 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[3 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == '~' && gameBoard[3 + i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'b') {
                                    placed = true;
                                    gameBoard[3 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                }
                            }
                        }
                        break;
                    case 'e', 'E':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                if (gameBoard[5][horizontalPlacement] == 'b' || gameBoard[5][horizontalPlacement] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[5][horizontalPlacement] == '~' && gameBoard[5][horizontalPlacement] != 'b' ) {
                                    placed = true;
                                    gameBoard[5][horizontalPlacement] = symbol;
                                }
                            }
                            case 'v', 'V' -> {
                                if (gameBoard[4 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'b' || gameBoard[4 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[4 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == '~' && gameBoard[4 + i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'b') {
                                    placed = true;
                                    gameBoard[4 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                }
                            }
                        }
                        break;
                    case 'f', 'F':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                if (gameBoard[6][horizontalPlacement] == 'b' || gameBoard[6][horizontalPlacement] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[6][horizontalPlacement] == '~' && gameBoard[6][horizontalPlacement] != 'b' ) {
                                    placed = true;
                                    gameBoard[6][horizontalPlacement] = symbol;
                                }
                            }
                            case 'v', 'V' -> {
                                if (gameBoard[5 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'b' || gameBoard[5 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[5 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == '~' && gameBoard[5 + i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'b') {
                                    placed = true;
                                    gameBoard[5 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                }
                            }
                        }
                        break;
                    case 'g', 'G':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                if (gameBoard[7][horizontalPlacement] == 'b' || gameBoard[7][horizontalPlacement] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[7][horizontalPlacement] == '~' && gameBoard[7][horizontalPlacement] != 'b' ) {
                                    placed = true;
                                    gameBoard[7][horizontalPlacement] = symbol;
                                }
                            }
                            case 'v', 'V' -> {
                                if (gameBoard[6 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'b' || gameBoard[6 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[6 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == '~' && gameBoard[6 + i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'b') {
                                    placed = true;
                                    gameBoard[6 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                }
                            }
                        }
                        break;
                    case 'h', 'H':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                if (gameBoard[8][horizontalPlacement] == 'b' || gameBoard[8][horizontalPlacement] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[8][horizontalPlacement] == '~' && gameBoard[8][horizontalPlacement] != 'b' ) {
                                    placed = true;
                                    gameBoard[8][horizontalPlacement] = symbol;
                                }
                            }
                            case 'v', 'V' -> {
                                if (gameBoard[7 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'b' || gameBoard[7 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[7 + i][Character.getNumericValue(shipCoordinate.charAt(1))] == '~' && gameBoard[7 + i][Character.getNumericValue(shipCoordinate.charAt(1))] != 'b') {
                                    placed = true;
                                    gameBoard[7 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                                }
                            }
                        }
                        break;
                    case 'i', 'I':
                        switch (vertHor) {
                            case 'h', 'H' -> {
                                if (gameBoard[9][horizontalPlacement] == 'b' || gameBoard[9][horizontalPlacement] == 'c') {
                                    placed = false;
                                    break outer;
                                } else if (gameBoard[9][horizontalPlacement] == '~' && gameBoard[9][horizontalPlacement] != 'b' ) {
                                    placed = true;
                                    gameBoard[9][horizontalPlacement] = symbol;
                                }
                            }
                        }
                        break;
                    default:
                        placed = false;
                        break;
                }
            }

        }
        if (!placed) {
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j <gameBoard[i].length; j++) {
                    if (gameBoard[i][j] == 'd') {
                        gameBoard[i][j] = '~';
                    }
                }
            }
        }
    }
}
