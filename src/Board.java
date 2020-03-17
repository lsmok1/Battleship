public class Board {


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
