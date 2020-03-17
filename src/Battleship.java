public class Battleship extends Ship {
    @Override
    void placeShip(char[][] gameBoard, int size, char symbol, String shipCoordinate, char vertHor, boolean placed) {

        for (int i = 1; i <= size; i++) {
            int horizontalPlacement =  Character.getNumericValue(shipCoordinate.charAt(1)) + i++;
            switch (shipCoordinate.charAt(0)) {
                case 'a', 'A':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[1][horizontalPlacement] = symbol;
                        case 'v', 'V' -> gameBoard[1 + i][Character.getNumericValue(shipCoordinate.charAt(1))] += symbol;
                    }
                case 'b', 'B':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[2][i] += symbol;
                        case 'v', 'V' -> gameBoard[2 + i][Character.getNumericValue(shipCoordinate.charAt(1))] += symbol;
                    }
                case 'c', 'C':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[3][i] += symbol;
                        case 'v', 'V' -> gameBoard[3 + i][Character.getNumericValue(shipCoordinate.charAt(1))] += symbol;
                    }
                case 'd', 'D':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[4][i] += symbol;
                        case 'v', 'V' -> gameBoard[4 + i][Character.getNumericValue(shipCoordinate.charAt(1))] += symbol;
                    }
                case 'e', 'E':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[5][i] += symbol;
                        case 'v', 'V' -> gameBoard[5 + i][Character.getNumericValue(shipCoordinate.charAt(1))] += symbol;
                    }
                case 'f', 'F':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[6][i] += symbol;
                        case 'v', 'V' -> gameBoard[6 + i][Character.getNumericValue(shipCoordinate.charAt(1))] += symbol;
                    }
                case 'g', 'G':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[7][i] += symbol;
                        case 'v', 'V' -> gameBoard[7 + i][Character.getNumericValue(shipCoordinate.charAt(1))] += symbol;
                    }
                case 'h', 'H':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[8][i] += symbol;
                        case 'v', 'V' -> gameBoard[8 + i][Character.getNumericValue(shipCoordinate.charAt(1))] += symbol;
                    }
                case 'i', 'I':
                    switch (vertHor) {
                        case 'h', 'H' -> gameBoard[9][i] += symbol;
                        case 'v', 'V' -> gameBoard[9 + i][Character.getNumericValue(shipCoordinate.charAt(1))] += symbol;
                    }
                default:
                    System.out.println("Can't place here!");
            }
        }

    }

}
//        switch(shipCoordinate) {
//
//            case "A1", "a1":
//                switch (vertHor) {
//                    case 'v', 'V':
////                        gameBoard[1][1] = b1.getSymbol();
////                        gameBoard[1][2] = b1.getSymbol();
////                        gameBoard[1][3] = b1.getSymbol();
////                        gameBoard[1][4] = b1.getSymbol();
//
//                        break;
//                    case 'h', 'H':
//                        gameBoard[1][1] = b1.getSymbol();
//                        gameBoard[2][1] = b1.getSymbol();
//                        gameBoard[3][1] = b1.getSymbol();
//                        gameBoard[4][1] = b1.getSymbol();
//                        break;
//                }
//        }


