public class Main{

    public static void main(String[] args){
	Board prueba1 = new Board();
	UnitModel unidad1 = new UnitModel("Yolo", 10, 2, 2, 2, 5, 5, 3, 1);
	prueba1.placeUnit(unidad1);
	prueba1.printDefaultBoard();
    }
}