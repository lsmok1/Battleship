public class Destroyer extends Ship {
    @Override
    void placeShip(char[][] gameBoard, int size, char symbol, String shipCoordinate, char vertHor, boolean placed) {
        Destroyer d1 = new Destroyer();
        d1.setSize(2);
        d1.setSymbol('d');
    }
}
