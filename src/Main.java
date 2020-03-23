import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
        p1Board.printGameBoard(p1Board.gameBoard);

        while (!c1.placed) {
            System.out.println("Can't place here! Please enter a new coordinate (A1 - I9): ");
            player1.setShipCoordinate(scan.nextLine());
            System.out.println("Vertical or Horizontal? (H/V): ");
            player1.setVertHor(scan.nextLine().charAt(0));
            //using the placeShip method after every scan to see if the boolean turned to true
            c1.placeShip(p1Board.gameBoard, c1.getSize(), c1.getSymbol(), player1.getShipCoordinate(), player1.getVertHor());
            if (c1.placed) {
                break;
            }
        }
            //if placed, break the loop and print board
        p1Board.printGameBoard(p1Board.gameBoard);

        System.out.println(player1.getName() + ", enter a coordinate for your Destroyer! (A1 - I9): ");
        player1.setShipCoordinate(scan.nextLine());
        System.out.println("Vertical or Horizontal? (H/V): ");
        player1.setVertHor(scan.nextLine().charAt(0));
        d1.placeShip(p1Board.gameBoard, d1.getSize(), d1.getSymbol(), player1.getShipCoordinate(), player1.getVertHor());
        p1Board.printGameBoard(p1Board.gameBoard);

        while (!d1.placed) {
            System.out.println("Can't place here! Please enter a new coordinate (A1 - I9): ");
            player1.setShipCoordinate(scan.nextLine());
            System.out.println("Vertical or Horizontal? (H/V): ");
            player1.setVertHor(scan.nextLine().charAt(0));
            //using the placeShip method after every scan to see if the boolean turned to true
            d1.placeShip(p1Board.gameBoard, d1.getSize(), d1.getSymbol(), player1.getShipCoordinate(), player1.getVertHor());
            if (d1.placed) {
                break;
            }
        }
        p1Board.printGameBoard(p1Board.gameBoard);
        //p2Board.printGameBoard(p2Board.gameBoard);

        //initing for p2
        Battleship b2 = new Battleship();
        b2.setSize(4);
        b2.setSymbol('b');
        Carrier c2 = new Carrier();
        c2.setSize(5);
        c2.setSymbol('c');
        Destroyer d2 = new Destroyer();
        d2.setSize(2);
        d2.setSymbol('d');

        System.out.println(player2.getName() + "'s turn! Enter coordinates for your Battleship! (A1 - I9): ");
        player2.setShipCoordinate(scan.nextLine());
        System.out.println("Vertical or Horizontal? (H/V): ");
        player2.setVertHor(scan.nextLine().charAt(0));
        b2.placeShip(p2Board.gameBoard, b2.getSize(), b2.getSymbol(), player2.getShipCoordinate(), player2.getVertHor());
//        p1Board.printGameBoard(gameBoard);

        while (!b2.placed) {
            System.out.println("Can't place here! Please enter a new coordinate (A1 - I9): ");
            player2.setShipCoordinate(scan.nextLine());
            System.out.println("Vertical or Horizontal? (H/V): ");
            player2.setVertHor(scan.nextLine().charAt(0));
            //using the placeShip method after every scan to see if the boolean turned to true
            b2.placeShip(p2Board.gameBoard, b2.getSize(), b2.getSymbol(), player2.getShipCoordinate(), player2.getVertHor());
            if (b2.placed) {
                break;
            }
        }

        //if placed, break the loop and print board
        p2Board.printGameBoard(p2Board.gameBoard);


        System.out.println(player2.getName() + ", enter a coordinate for your Carrier! (A1 - I9): ");
        player2.setShipCoordinate(scan.nextLine());
        System.out.println("Vertical or Horizontal? (H/V): ");
        player2.setVertHor(scan.nextLine().charAt(0));
        c2.placeShip(p2Board.gameBoard, c2.getSize(), c2.getSymbol(), player2.getShipCoordinate(), player2.getVertHor());
        p2Board.printGameBoard(p2Board.gameBoard);

        while (!c2.placed) {
            System.out.println("Can't place here! Please enter a new coordinate (A1 - I9): ");
            player2.setShipCoordinate(scan.nextLine());
            System.out.println("Vertical or Horizontal? (H/V): ");
            player2.setVertHor(scan.nextLine().charAt(0));
            //using the placeShip method after every scan to see if the boolean turned to true
            c2.placeShip(p2Board.gameBoard, c2.getSize(), c2.getSymbol(), player2.getShipCoordinate(), player2.getVertHor());
            if (c2.placed) {
                break;
            }
        }
        //if placed, break the loop and print board
        p2Board.printGameBoard(p2Board.gameBoard);

        System.out.println(player2.getName() + ", enter a coordinate for your Destroyer! (A1 - I9): ");
        player2.setShipCoordinate(scan.nextLine());
        System.out.println("Vertical or Horizontal? (H/V): ");
        player2.setVertHor(scan.nextLine().charAt(0));
        d2.placeShip(p2Board.gameBoard, d2.getSize(), d2.getSymbol(), player2.getShipCoordinate(), player2.getVertHor());
        p2Board.printGameBoard(p2Board.gameBoard);

        while (!d2.placed) {
            System.out.println("Can't place here! Please enter a new coordinate (A1 - I9): ");
            player2.setShipCoordinate(scan.nextLine());
            System.out.println("Vertical or Horizontal? (H/V): ");
            player2.setVertHor(scan.nextLine().charAt(0));
            //using the placeShip method after every scan to see if the boolean turned to true
            d2.placeShip(p2Board.gameBoard, d2.getSize(), d2.getSymbol(), player2.getShipCoordinate(), player2.getVertHor());
            if (d2.placed) {
                break;
            }
        }
        p2Board.printGameBoard(p2Board.gameBoard);
        //creating new boards for display only (player1 gets player2Display, p2 gets p1Display
        Board p2Display = new Board();
        Board p1Display = new Board();
        p2Display.printGameBoard(p2Display.gameBoard);

        Missile m1 = new Missile();
        Missile m2 = new Missile();

        while (!m1.winnerWinner || !m2.winnerWinner) {
            System.out.println(player1.getName() + "'s turn! Enter a coordinate for your missile (A1 - I9): ");
            player1.setMissileCoordinate(scan.nextLine());
            m1.launchMissile(p2Board.gameBoard, player1.getMissileCoordinate(), p2Display.gameBoard);
            p2Display.printGameBoard(p2Display.gameBoard);

            while (!m1.validGuess) {
                System.out.println("Not a valid guess! Enter a new coordinate (A1 - I9): ");
                player1.setMissileCoordinate(scan.nextLine());
                m1.launchMissile(p2Board.gameBoard, player1.getMissileCoordinate(), p2Display.gameBoard);
                p2Display.printGameBoard(p2Display.gameBoard);
            }

            System.out.println(player2.getName() + "'s turn! Enter a coordinate for your missile (A1 - I9): ");
            player2.setMissileCoordinate(scan.nextLine());
            m2.launchMissile(p1Board.gameBoard, player2.getMissileCoordinate(), p1Display.gameBoard);
            p1Display.printGameBoard(p1Display.gameBoard);

            while (!m2.validGuess) {
                System.out.println("Not a valid guess! Enter a new coordinate (A1 - I9): ");
                player2.setMissileCoordinate(scan.nextLine());
                m2.launchMissile(p2Board.gameBoard, player1.getMissileCoordinate(), p1Display.gameBoard);
                p1Display.printGameBoard(p1Display.gameBoard);
            }
            if (m1.winnerWinner) {
                System.out.println(player1.getName() + " won!");
                break;
            } else if (m2.winnerWinner) {
                System.out.println(player2.getName() + " won!");
                break;
            }
        }

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

