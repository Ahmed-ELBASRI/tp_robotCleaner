package lesRobotsPollueurs;

public class Monde {
	//variables d'instance
	private int nbrLines, nbrColumns;
	private boolean[][] mat ;
	//Constructors
	public Monde() {
		mat = new boolean[10][10];
	}
	public Monde(int nbrLines,int nbrColumns) {
		this.nbrLines = nbrLines;
		this.nbrColumns = nbrColumns;
		mat = new boolean[nbrLines][nbrColumns];
	}
	public String toString() {
		String chaineMonde="";
		for(int i=0;i<nbrLines;i++) {
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

}
