import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Board> checkValid = new ArrayList<>();

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
        System.out.println("Okay, " + player1.getName() + " and " + player2.getName() + "! Get ready to start! " + player1.getName() + " will place their 3 ships first!");
        //initing ship objects for player1
        Battleship b1 = new Battleship();
        b1.setSize(4);
        b1.setSymbol('b');
        Carrier c1 = new Carrier();
        c1.setSize(5);
        c1.setSymbol('c');
        Destroyer d1 = new Destroyer();
        d1.setSize(2);
        d1.setSymbol('d');

        System.out.println(player1.getName() + "'s turn! Enter coordinates for your Battleship! (A1 - I9): ");
        player1.setShipCoordinate(scan.nextLine());
        System.out.println("Vertical or Horizontal? (H/V): ");
        player1.setVertHor(scan.nextLine().charAt(0));
        b1.placeShip(p1Board.gameBoard, b1.getSize(), b1.getSymbol(), player1.getShipCoordinate(), player1.getVertHor());
//        p1Board.printGameBoard(gameBoard);

        while (!b1.placed) {
            System.out.println("Can't place here! Please enter a new coordinate (A1 - I9): ");
            player1.setShipCoordinate(scan.nextLine());
            System.out.println("Vertical or Horizontal? (H/V): ");
            player1.setVertHor(scan.nextLine().charAt(0));
            //using the placeShip method after every scan to see if the boolean turned to true
            b1.placeShip(p1Board.gameBoard, b1.getSize(), b1.getSymbol(), player1.getShipCoordinate(), player1.getVertHor());
            if (b1.placed) {
                break;
            }
        }

        //if placed, break the loop and print board
        p1Board.printGameBoard(p1Board.gameBoard);


        System.out.println(player1.getName() + ", enter a coordinate for your Carrier! (A1 - I9): ");
        player1.setShipCoordinate(scan.nextLine());
        System.out.println("Vertical or Horizontal? (H/V): ");
        player1.setVertHor(scan.nextLine().charAt(0));
        c1.placeShip(p1Board.gameBoard, c1.getSize(), c1.getSymbol(), player1.getShipCoordinate(), player1.getVertHor());
//        p1Board.checkShipPlacement(p1Board.gameBoard);
//        System.out.println(p1Board.validPlace);
        while (!c1.placed) {
            System.out.println("Can't place here! Please enter a new coordinate (A1 - I9): ");
            player1.setShipCoordinate(scan.nextLine());
            System.out.println("Vertical or Horizontal? (H/V): ");
            player1.setVertHor(scan.nextLine().charAt(0));
            //using the placeShip method after every scan to see if the boolean turned to true
            c1.placeShip(p1Board.gameBoard, c1.getSize(), c1.getSymbol(), player1.getShipCoordinate(), player1.getVertHor());
//            p1Board.checkShipPlacement(p1Board.gameBoard);
            p1Board.printGameBoard(p1Board.gameBoard);
            if (c1.placed) {
//                System.out.println("aogjfiasmfams");
                break;
            }
        }
        //if placed, break the loop and print board
        p1Board.printGameBoard(p1Board.gameBoard);

        //p2Board.printGameBoard(p2Board.gameBoard);



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
