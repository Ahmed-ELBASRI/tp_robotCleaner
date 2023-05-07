package lesRobotsPollueurs;

public class Monde {
	//attribut d'instance
	private int nbrLines, nbrColumns;
	private boolean[][] mat ;
	//Constructors
	public Monde() {
		nbrLines=10;
		nbrColumns=10;
		mat = new boolean[10][10];
	}
	public int getNbrLines() {
		return this.nbrLines;
	}
	public int getNbrColumns() {
		return this.nbrColumns;
	}
	public Monde(int nbrLines,int nbrColumns) {
		this.nbrLines = nbrLines;
		this.nbrColumns = nbrColumns;
		mat = new boolean[nbrLines][nbrColumns];
	}
	public String toString() {
		String chaineMonde="";	
		for(int i=0;i<mat.length;i++) {
			for(int j=0 ; j<nbrColumns;j++) {
				if(mat[i][j]==true) {
					chaineMonde+="o";
				}
				else {
					chaineMonde+=".";
				}
			}
		}
		return chaineMonde;
	}
	public void metPapierGras(int i,int j) {
		mat[i][j]=true;
	}
	public void prendPapierGras(int i,int j) {
		mat[i][j]=false;
	}
	public boolean estSale(int i,int j) {
		if(mat[i][j]==true) {
			return true;
		}
		return false;
	}
	public int nbrPapierGras() {
		int nbPapierGras=0;
		for(int i=0;i<nbrLines;i++) {
			for(int j=0 ; j<nbrColumns;j++) {
				if(estSale(i,j)) {
					nbPapierGras++;
				}
			}
		}
		return nbPapierGras;
	}

}
