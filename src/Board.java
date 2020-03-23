import java.util.ArrayList;

public class Board {

    boolean validPlace = false;
    //initializing a new gameBoard for every board instantiated
    public char[][] gameBoard = {
            {' ', '1', '2', '3', '4', '5', '6', '7', '8', '9'},
            {'A', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
            {'B', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
            {'C', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
            {'D', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
            {'E', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
            {'F', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
            {'G', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
            {'H', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
            {'I', '~', '~', '~', '~', '~', '~', '~', '~', '~'}
    };



//    public boolean checkShipPlacement(char[][] gameBoard) {
//        outer:
//        for (int i = 0; i < gameBoard.length; i++) {
//            for (int j = 0; j < gameBoard[i].length; j++) {
//                if (positionB == positionC || positionB == positionD) {
////                    System.out.println("A ship is already placed here!");
//                    validPlace = false;
//                    break outer;
//                } else {
//                    validPlace = true;
//                }
//            }
//        }
//        return validPlace;
//    }
    public void printGameBoard(char[][] gameBoard) {

        for(char[] row : gameBoard) {
            for (char c : row) {

                //printing a space before and after each char so everything is spaced out better
                System.out.print(" " + c + " ");

            }
            //printing a line for each row
            System.out.println();
        }

    }
}
