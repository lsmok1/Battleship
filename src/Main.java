import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player();
        System.out.println("Enter Player 1 name: ");
        player1.setName(scan.nextLine());

        Player player2 = new Player();
        System.out.println("Enter Player 2 name: ");
        player2.setName(scan.nextLine());

        System.out.println("Okay, " + player1.getName() + " and " + player2.getName() + "! Get ready to start!");

        Board newBoard = new Board();
        newBoard.printGameBoard();
    }
}
