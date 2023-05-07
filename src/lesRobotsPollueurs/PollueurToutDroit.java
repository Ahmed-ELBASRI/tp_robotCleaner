package lesRobotsPollueurs;

public class PollueurToutDroit extends RobotPollueur {
	private int colDepart;
    public PollueurToutDroit(int colDepart, Monde monde) {
        super(0, colDepart, monde);
        this.colDepart = colDepart;
    }
    public void parcourir() {
    	for(int i=0;i<this.getMonde().getNbrLines();i++) {
    		this.getMonde().metPapierGras(i, this.colDepart);
    	}
    }
}
