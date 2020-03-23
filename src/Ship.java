import java.awt.*;
import java.util.ArrayList;

public abstract class Ship {
//    ArrayList<char[][]> shipPlacements = new ArrayList<>();
//    @Override
//    public String toString(){
//        return shipPlacements.toString();
//    }
    //initing the size of the ship and creating public getters and setters for the battleship and carrier
    //only doing this to demonstrate encapsulation
    private int size;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    //only doing this to demonstrate encapsulation
    private char symbol;
    public char getSymbol() {
        return symbol;
    }
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }



    //creating the abstract method that the carrier and battleship can override to add functionality
    abstract void placeShip(char[][] gameBoard, int size, char symbol, String shipCoordinate, char vertHor);
}

