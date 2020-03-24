import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.stream.Stream;

public class Missile {
    boolean validGuess = false;
    boolean winnerWinner = false;
    char missedHit = 'm';
    char gotEm = 'x';

    public void launchMissile (char[][] gameBoard, String missileCoordinate, char[][] gameBoardDisplay) {
        int xCounter = (int) Arrays.stream(gameBoardDisplay)
                .map(CharBuffer::wrap)
                .flatMapToInt(CharBuffer::chars)
                .filter(x -> x == 'x')
                .count();

        if (xCounter == 11) {
            winnerWinner=true;
        }

        switch (missileCoordinate.charAt(0)) {
            case 'A', 'a' -> {
                if (gameBoardDisplay[1][Character.getNumericValue(missileCoordinate.charAt(1))] == 'x' || gameBoardDisplay[1][Character.getNumericValue(missileCoordinate.charAt(1))] == 'm') {
                    validGuess = false;
                } else if (gameBoard[1][Character.getNumericValue(missileCoordinate.charAt(1))] != '~') {
                    gameBoardDisplay[1][Character.getNumericValue(missileCoordinate.charAt(1))] = gotEm;
                    System.out.println("NICE HIT!");
                    validGuess = true;
                } else {
                    gameBoardDisplay[1][Character.getNumericValue(missileCoordinate.charAt(1))] = missedHit;
                    System.out.println("Better luck next time!");
                    validGuess = true;
                }
            }
            case 'B', 'b' -> {
                if (gameBoardDisplay[2][Character.getNumericValue(missileCoordinate.charAt(1))] == 'x' || gameBoardDisplay[2][Character.getNumericValue(missileCoordinate.charAt(1))] == 'm') {
                    validGuess = false;
                } else if (gameBoard[2][Character.getNumericValue(missileCoordinate.charAt(1))] != '~') {
                    gameBoardDisplay[2][Character.getNumericValue(missileCoordinate.charAt(1))] = gotEm;
                    System.out.println("NICE HIT!");
                    validGuess = true;
                } else {
                    gameBoardDisplay[2][Character.getNumericValue(missileCoordinate.charAt(1))] = missedHit;
                    System.out.println("Better luck next time!");
                    validGuess = true;
                }
            }
            case 'C', 'c' -> {
                if (gameBoardDisplay[3][Character.getNumericValue(missileCoordinate.charAt(1))] == 'x' || gameBoardDisplay[3][Character.getNumericValue(missileCoordinate.charAt(1))] == 'm') {
                    validGuess = false;
                } else if (gameBoard[3][Character.getNumericValue(missileCoordinate.charAt(1))] != '~') {
                    gameBoardDisplay[3][Character.getNumericValue(missileCoordinate.charAt(1))] = gotEm;
                    System.out.println("NICE HIT!");
                    validGuess = true;
                } else {
                    gameBoardDisplay[3][Character.getNumericValue(missileCoordinate.charAt(1))] = missedHit;
                    System.out.println("Better luck next time!");
                    validGuess = true;
                }
            }
            case 'D', 'd' -> {
                if (gameBoardDisplay[4][Character.getNumericValue(missileCoordinate.charAt(1))] == 'x' || gameBoardDisplay[4][Character.getNumericValue(missileCoordinate.charAt(1))] == 'm') {
                    validGuess = false;
                } else if (gameBoard[4][Character.getNumericValue(missileCoordinate.charAt(1))] != '~') {
                    gameBoardDisplay[4][Character.getNumericValue(missileCoordinate.charAt(1))] = gotEm;
                    System.out.println("NICE HIT!");
                    validGuess = true;
                } else {
                    gameBoardDisplay[4][Character.getNumericValue(missileCoordinate.charAt(1))] = missedHit;
                    System.out.println("Better luck next time!");
                    validGuess = true;
                }
            }
            case 'E', 'e' -> {
                if (gameBoardDisplay[5][Character.getNumericValue(missileCoordinate.charAt(1))] == 'x' || gameBoardDisplay[5][Character.getNumericValue(missileCoordinate.charAt(1))] == 'm') {
                    validGuess = false;
                } else if (gameBoard[5][Character.getNumericValue(missileCoordinate.charAt(1))] != '~') {
                    gameBoardDisplay[5][Character.getNumericValue(missileCoordinate.charAt(1))] = gotEm;
                    System.out.println("NICE HIT!");
                    validGuess = true;
                } else {
                    gameBoardDisplay[5][Character.getNumericValue(missileCoordinate.charAt(1))] = missedHit;
                    System.out.println("Better luck next time!");
                    validGuess = true;
                }
            }
            case 'F', 'f' -> {
                if (gameBoardDisplay[6][Character.getNumericValue(missileCoordinate.charAt(1))] == 'x' || gameBoardDisplay[6][Character.getNumericValue(missileCoordinate.charAt(1))] == 'm') {
                    validGuess = false;
                } else if (gameBoard[6][Character.getNumericValue(missileCoordinate.charAt(1))] != '~') {
                    gameBoardDisplay[6][Character.getNumericValue(missileCoordinate.charAt(1))] = gotEm;
                    System.out.println("NICE HIT!");
                    validGuess = true;
                } else {
                    gameBoardDisplay[6][Character.getNumericValue(missileCoordinate.charAt(1))] = missedHit;
                    System.out.println("Better luck next time!");
                    validGuess = true;
                }
            }
            case 'G', 'g' -> {
                if (gameBoardDisplay[7][Character.getNumericValue(missileCoordinate.charAt(1))] == 'x' || gameBoardDisplay[7][Character.getNumericValue(missileCoordinate.charAt(1))] == 'm') {
                    validGuess = false;
                } else if (gameBoard[7][Character.getNumericValue(missileCoordinate.charAt(1))] != '~') {
                    gameBoardDisplay[7][Character.getNumericValue(missileCoordinate.charAt(1))] = gotEm;
                    System.out.println("NICE HIT!");
                    validGuess = true;
                } else {
                    gameBoardDisplay[7][Character.getNumericValue(missileCoordinate.charAt(1))] = missedHit;
                    System.out.println("Better luck next time!");
                    validGuess = true;
                }
            }
            case 'H', 'h' -> {
                if (gameBoardDisplay[8][Character.getNumericValue(missileCoordinate.charAt(1))] == 'x' || gameBoardDisplay[8][Character.getNumericValue(missileCoordinate.charAt(1))] == 'm') {
                    validGuess = false;
                } else if (gameBoard[8][Character.getNumericValue(missileCoordinate.charAt(1))] != '~') {
                    gameBoardDisplay[8][Character.getNumericValue(missileCoordinate.charAt(1))] = gotEm;
                    System.out.println("NICE HIT!");
                    validGuess = true;
                } else {
                    gameBoardDisplay[8][Character.getNumericValue(missileCoordinate.charAt(1))] = missedHit;
                    System.out.println("Better luck next time!");
                    validGuess = true;
                }
            }
            case 'I', 'i' -> {
                if (gameBoardDisplay[9][Character.getNumericValue(missileCoordinate.charAt(1))] == 'x' || gameBoardDisplay[9][Character.getNumericValue(missileCoordinate.charAt(1))] == 'm') {
                    validGuess = false;
                } else if (gameBoard[9][Character.getNumericValue(missileCoordinate.charAt(1))] != '~') {
                    gameBoardDisplay[9][Character.getNumericValue(missileCoordinate.charAt(1))] = gotEm;
                    System.out.println("NICE HIT!");
                    validGuess = true;
                } else {
                    gameBoardDisplay[9][Character.getNumericValue(missileCoordinate.charAt(1))] = missedHit;
                    System.out.println("Better luck next time!");
                    validGuess = true;
                }
            }

        }
    }
}
