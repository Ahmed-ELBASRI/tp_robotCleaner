package lesRobotsPollueurs;

public class RobotNettoyeur extends Robot{
	public RobotNettoyeur(int x,int y,Monde m) {
		super(x,y,m);
	}
	public void Nettoyer() {
		Monde m =this.getMonde();
		m.prendPapierGras(this.getPosX(),this.getPosY());
	}
	@Override
	public void parcourir() {
		Monde m =this.getMonde();
		for (int i = 0; i < m.getNbrLines(); i++) {
		    if (i % 2 == 0) {
		        for (int j = 0; j < m.getNbrColumns(); j++) {
		        	if(m.estSale(i, j)) {
		        		m.prendPapierGras(i, j);
		        	}
		        }
		    } else {
		        for (int j = m.getNbrColumns() ; j > 0; j--) {
		        	if(m.estSale(i, j)) {
		        		m.prendPapierGras(i, j);
		        	}
		        }
		    }
		}
	}
}
