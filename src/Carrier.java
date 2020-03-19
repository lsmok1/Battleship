public class Carrier extends Ship {
    @Override
    void placeShip(char[][] gameBoard, int size, char symbol, String shipCoordinate, char vertHor) {
        Carrier c1 = new Carrier();
        c1.setSize(5);
        c1.setSymbol('c');
    }
}
