package lesRobotsPollueurs;

public class TestRobot {

	public static void main(String[] args) {
		Monde m = new Monde();
		m.metPapierGras(2, 3);
		m.metPapierGras(1, 3);
		m.metPapierGras(4,3);
		m.metPapierGras(5,3);
		m.metPapierGras(6,3);
		m.prendPapierGras(4,3);
		System.out.println(m.estSale(2, 3));
		System.out.println(m.nbrPapierGras());
		System.out.println(m);

	}

}
