public class Player {
//    boolean placedBattleship = false;
//    boolean placedCarrier = false;
//    boolean placedDestroyer = false;

    //made name private, so have to use getters and setters in the main method
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private String shipCoordinate;
    public void setShipCoordinate(String shipCoordinate) {
        this.shipCoordinate = shipCoordinate;
    }
    public String getShipCoordinate() {
        return shipCoordinate;
    }

    public char vertHor;
    public void setVertHor(char vertHor) {
        this.vertHor = vertHor;
    }
    public char getVertHor() {
        return vertHor;
    }

    private int missileCoordinate;
}
