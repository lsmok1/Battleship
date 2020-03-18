public class Battleship extends Ship {
    @Override
    void placeShip(char[][] gameBoard, int size, char symbol, String shipCoordinate, char vertHor, boolean placed) {
        //iterates thru the size of the ship, gets the numeric value of the 2nd char in the coordinates
        for (int i = 1; i <= size; i++) {
            int horizontalPlacement = Character.getNumericValue(shipCoordinate.charAt(1)) + i;
            //switch case for the first char in coordinates
            switch (shipCoordinate.charAt(0)) {
                case 'a', 'A':
                    //switch case for horizontal or vert
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[1][horizontalPlacement - 1] = symbol;
                        case 'v', 'V' -> gameBoard[i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                    }
                    //breaking after the first switch case so it doesn't iterate all the way down the board
                    break;
                case 'b', 'B':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[2][horizontalPlacement - 1] = symbol;
                        case 'v', 'V' -> gameBoard[1 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                    }
                    break;
                case 'c', 'C':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[3][horizontalPlacement - 1] = symbol;
                        case 'v', 'V' -> gameBoard[2 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                    }
                    break;
                case 'd', 'D':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[4][horizontalPlacement - 1] = symbol;
                        case 'v', 'V' -> gameBoard[3 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                    }
                    break;
                case 'e', 'E':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[5][horizontalPlacement - 1] = symbol;
                        case 'v', 'V' -> gameBoard[4 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                    }
                    break;
                case 'f', 'F':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[6][horizontalPlacement - 1] = symbol;
                        case 'v', 'V' -> gameBoard[5 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                    }
                    break;
                case 'g', 'G':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[7][horizontalPlacement - 1] = symbol;
                        case 'v', 'V' -> gameBoard[6 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                    }
                    break;
                case 'h', 'H':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[8][horizontalPlacement - 1] = symbol;
                        case 'v', 'V' -> gameBoard[7 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                    }
                    break;
                case 'i', 'I':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[9][horizontalPlacement - 1] = symbol;
                        case 'v', 'V' -> gameBoard[8 + i][Character.getNumericValue(shipCoordinate.charAt(1))] = symbol;
                    }
                    break;
                default:
                    System.out.println("Can't place here!");
            }
        }

    }

}


