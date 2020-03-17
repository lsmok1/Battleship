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
    //creating the abstract method that the carrier and battleship can override to add functionality
    abstract void placeShip();
}
