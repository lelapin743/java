package PerfectMinesweeper ;

public class Cell {
	//Définition de caracts
	
	private static int nbCells=0; //attribut de classe
	private static final int maxNeighbours=8;
	
	private boolean bomb; //attribut d'instance
	private int bombCount; // comprit entre 0 et 8
	private Cell[] neighbours = new Cell[maxNeighbours];
	
	public Cell(){ //default constructor
		this.bomb=false;
		this.bombCount=-1;

	}
	public Cell(boolean bomb, int bombCount) { //constructor
		this.bomb=bomb;
		this.bombCount=bombCount;
		nbCells++;
		
	}	
	public static int getnbCells(){
		return nbCells;
	}
	public boolean getbomb() {
		return this.bomb;
	}
	public int getbombCount() {
		return this.bombCount;
	}
	public void setbomb(boolean bomb) {
		this.bomb=bomb;
		
		//Code to be used on a global bomb counter thing, but that should be counted in the map
		/*if (bomb && (!this.bomb)) {
			bombCount++;
		}
		else if (!bomb && (this.bomb)) {
			bombCount--;
		}*/
		//Testing syntax on  Condition ? ifTrue : ifFalse
		/*boolean test = false;
		test = bomb ? false: true;
		System.out.println(test);*/
	}
	/*void setbombCount(int bombCount) {
		this.bombCount=bombCount;
	}*/
	public void setNeighbours(Cell[] list){
		this.neighbours = list;
	}
	public Cell[] getNeighbours(){
		return this.neighbours;
	}
	
	/**Ceci permet d'avoir de la documentation*/
	void initialiser(boolean bomb, int bombCount) {
		this.bomb = bomb;
		this.bombCount = bombCount;
	}
	public void destroy() {
		//this.finalize();
		nbCells--;
	}
	//methode de classe
	/*public static Cell noInfo(){ //constructor de classe
		
		.bomb=false;
		.bombCount = 0;
		return this;
	}*/
	public String toString() {
		return (""+this.bomb);
	}
}
