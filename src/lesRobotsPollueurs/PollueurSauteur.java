package lesRobotsPollueurs;

public class PollueurSauteur extends RobotPollueur {
	private int delTax;
    public PollueurSauteur(Monde monde,int delTax) {
        super(0, 0, monde);
        this.delTax=delTax;
    }
    public void parcourir() {
        int line = 0;
        int col = 0;

        while (line < this.getMonde().getNbrLines()) {
            this.getMonde().metPapierGras(line, col);;
            col += this.delTax;
            line++;

            if (col>= this.getMonde().getNbrColumns()) {
                col = col % col;
            }
        }
    }
}
