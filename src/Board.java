public class Board {
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
