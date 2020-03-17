import java.awt.*;

public abstract class Ship {
    //initing the size of the ship and creating public getters and setters for the battleship and carrier
    private int size;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    private char symbol;
    public char getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    //creating the abstract method that the carrier and battleship can override to add functionality
    abstract void placeShip(char[][] gameBoard, int size, char symbol, String shipCoordinate, char vertHor, boolean placed);
}
