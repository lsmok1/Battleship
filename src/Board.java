public class Board {

    public static void printGameBoard() {
        char[][] gameBoard = {
                {' ', '1', '2', '3', '4', '5', '6', '7', '8', '9'},
                {'1', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'2', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'3', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'4', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'5', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'6', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'7', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'8', '~', '~', '~', '~', '~', '~', '~', '~', '~'},
                {'9', '~', '~', '~', '~', '~', '~', '~', '~', '~'}
        };
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
