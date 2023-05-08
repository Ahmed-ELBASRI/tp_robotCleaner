package lesRobotsPollueurs;

public class NettoyeurDistrait extends Robot{
	public NettoyeurDistrait(int x,int y,Monde m) {
		super(x,y,m);
	}
	@Override
	public void parcourir() {
		Monde m =this.getMonde();
		int nbrPapier=0;
		for (int i = 0; i < m.getNbrLines(); i++) {
		    if (i % 2 == 0) {
		        for (int j = 0; j < m.getNbrColumns(); j++) {
		        	if(m.estSale(i, j)) {
		        		if(nbrPapier==0) {
			        		m.prendPapierGras(i, j);
			        		nbrPapier++;
		        		}
		        		else {
		        			nbrPapier=0;
		        		}
		        	}
		        }
		    } else {
		        for (int j = m.getNbrColumns() ; j > 0; j--) {
		        	if(m.estSale(i, j)) {
		        		if(nbrPapier==0) {
			        		m.prendPapierGras(i, j);
			        		nbrPapier++;
		        		}
		        		else {
		        			nbrPapier=0;
		        		}
		        	}
		        }
		    }
		}
	}
}
