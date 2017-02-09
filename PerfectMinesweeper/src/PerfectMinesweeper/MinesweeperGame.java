package PerfectMinesweeper ;
import PerfectMinesweeper.Cell;

public class MinesweeperGame {
	public static void main(String[] args){
		System.out.println("MinesweeperGame wants to use other classes");
		int a =4;
		Cell test = new Cell();
		System.out.println(test.getbombCount());
		test.setbomb(true);
		System.out.println(test.getbomb());
	}
}
