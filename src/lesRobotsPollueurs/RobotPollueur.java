package lesRobotsPollueurs;

public abstract class RobotPollueur extends Robot {
	public RobotPollueur(int x,int y,Monde m) {
		super(x,y,m);
	}
	public void Polluer() {
		Monde m =this.getMonde();
		m.metPapierGras(this.getPosX(),this.getPosY());
	}
}
