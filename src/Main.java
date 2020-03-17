public class Main {
    public static void main(String[] args) {
        System.out.println(
                """
               Welcome to Battleship! This is a 2-person game where you each have your own map to place your ships!
               You will both get 3 ships: 1 [Battleship], 1 [Carrier], and 1 [Destroyer]. The [Battleship] has a
               size of 4 tiles, the [Carrier] has a size of 5 tiles, and the [Destroyer] has a size of 2 tiles. You can
               place them anywhere on your (9x9) map either horizontally or vertically and so can the other player.
               Every turn, each player must decide which coordinates to send their missile. (e.g. A1) to send
               their missile. Every 'miss' is represented by an 'm', while every hit is represented with an
               'x'!You must hit all the tiles containing the ship in order to sink the ship. Once all opposing ships are
               sunk (by whichever player), the game will end. GLHF!
                """
        );
        Board newBoard = new Board();
        newBoard.printGameBoard();
    }
}
