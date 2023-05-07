package lesRobotsPollueurs;
import java.util.*;
public abstract class Robot {
	//
	private int posX,posY;
	private Monde m;
	public Robot(int x,int y,Monde m) {
		this.posX=x;
		this.posY=y;
		this.m=m;
	}
	public Robot(Monde m) {
		this(new Random().nextInt(m.getNbrLines() - 1), new Random().nextInt(m.getNbrColumns() - 1), m);	
		}
	public void vaEn(int i,int j) {
		this.posX=i;
		this.posY=j;
	}
	public int getPosX() {
		return this.posX;
	}
	public int getPosY() {
		return this.posY;
	}
	public Monde getMonde() {
		return this.m;
	}
	abstract public void parcourir();
}
