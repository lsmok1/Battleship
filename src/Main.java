public class Main {
    public static void main(String[] args) {
        System.out.println(
                """
                Welcome to Battleship! This is a 2-person game where you each have your own map/grid/board to place your
                ships! You will both get 2 ships: 1 [Battleship] and 1 [Carrier]. The Battleship has a size of 2 tiles
                while the Carrier has a size of 3 tiles. You can place them anywhere on your (9x9) map either
                horizontally or vertically and so can the other player. Every turn, each player must decide which
                coordinates to send their missile. Every turn, you will get their board returned without knowing where
                their ships are placed. However, you will see where you shot your missiles and whether or not they hit
                something. You must hit all the tiles containing the ship in order to sink the ship. Once both ships are
                sunk (by whichever player), the game will end. Enjoy!
                """
        );
//        Board newBoard = new Board();
//        newBoard.printGameBoard();
    }
}
