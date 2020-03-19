import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] gameBoard = {
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
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {

            }
        }
        Board p1Board = new Board(); //player1's actual board
        Board p2Board = new Board(); //player2's actual board
        System.out.println(
                """
               Welcome to Battleship! This is a 2-person game where you each have your own map to place your ships!
               You will both get 3 ships: 1 [Battleship], 1 [Carrier], and 1 [Destroyer]. The [Battleship] has a
               size of 4 tiles, the [Carrier] has a size of 5 tiles, and the [Destroyer] has a size of 2 tiles. You can
               place them anywhere on your (9x9) map either horizontally or vertically and so can the other player.
               Every turn, each player must decide which coordinates to send their missile (e.g. A1). Every 'miss' is
               represented by an 'm', while every hit is represented with an 'x'! You will not have access to the
               ability to see where your opponents' ships are placed. You must hit all the tiles containing the ship in
               order to sink the ship. Once all opposing ships are sunk (by whichever player), the game will end. GLHF!
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
        Battleship b1 = new Battleship();
        b1.setSize(4);
        b1.setSymbol('b');
            while (!b1.placed) {

                System.out.println(player1.getName() + "'s turn! Enter coordinates for your Battleship! (A1 - I9): ");
                player1.setShipCoordinate(scan.nextLine());
                System.out.println("Vertical or Horizontal? (H/V): ");

                player1.setVertHor(scan.next().charAt(0));
                if (b1.placed) {
                    break;
                }

                b1.placeShip(gameBoard, b1.getSize(), b1.getSymbol(), player1.getShipCoordinate(), player1.getVertHor());
                p1Board.printGameBoard(gameBoard);

//                System.out.println("Are you sure you want to place your battleship at: " + player1.getShipCoordinate().toUpperCase() + " (" + player1.getVertHor() + ")?");
//                char areYouSure = scan.next().charAt(0);
//                player1.placedBattleship = areYouSure == 'y';
//                if (areYouSure == 'n') {
//                    player1.setShipCoordinate(null);
//                    player1.setVertHor('\u0000');
//                    player.place
//                }
            }
//        while (!player1.placedCarrier) {
//            System.out.println(player1.getName() + "'s turn! Enter coordinates for your Battleship! (A1 - I9): ");
//            player1.setShipCoordinate(scan.nextLine());
//            System.out.println("Vertical or Horizontal? (H/V): ");
//            player1.setVertHor(scan.next().charAt(0));
//            Carrier c1 = new Carrier();
//
//        }



        //creating new boards for display only (player1 gets player2Display, p2 gets p1Display
        Board p2Display = new Board();
        Board p1Display = new Board();

/*
Commenting out for testing purposes

        //player1 gets player2's board (without the ships' locations)
        System.out.println(player2.getName() + "'s board: ");
        p2Display.printGameBoard();
        //player2 gets player1's board
        System.out.println(player1.getName() + "'s board: ");
        p1Display.printGameBoard();

 */
    }
}
