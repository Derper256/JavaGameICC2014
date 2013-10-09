public class Board{
    private String[][] board;

    public Board(){
	board = new String[5][5];
    }

    public Board(int x, int y){
	board = new String[x][y];
    }

    public Board(int x, int y, int[] obsSta, int[] obsEnd){
	board = new String[x][y];
	board[obsSta[0]][obsEnd[0]] = "obs";
	board[obsSta[1]][obsEnd[1]] = "obs";
    }

    public void placeUnit(UnitModel uM){
	board[uM.getPosX()][uM.getPosY()] = uM.getName();
    }

    public void printDefaultBoard(){
	for(int i = 0; i < 5; i++){
	    for(int j = 0; j < 5; j++){
		if(j == 0){
		    System.out.println("-----------------------------------" +
                                       "-----------------------------------" +
				       "-----------");
		    System.out.print("|\t" + board[j][i] + "\t");
		} else if(j == 4){
		    System.out.print("|\t" + board[j][i] + "\t|\n");
		    System.out.println("-----------------------------------" +
                                       "-----------------------------------" +
				       "-----------");
		} else {
		    System.out.print("|\t" + board[j][i] + "\t");
		}
	    }
	}
    }
}