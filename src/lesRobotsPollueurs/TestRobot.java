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
//		// TODO Auto-generated method stub
//		Monde m=new Monde(10,10);
//		
//		/*PollueurTousDroit pl=new PollueurTousDroit(m);
//		pl.Parcourir();*/
//		//pl.Polluer();
//		PollueurTousDroit ps=new PollueurTousDroit(m);
//		ps.Parcourir();
//	
//	/*	
//		if(m.estSale(0, 0)) {
//			System.out.println("sale");
//		}
//		else {
//			System.out.println("n'est pas sale");
//		}
//		*/
//		NettoyeurDistrait net=new NettoyeurDistrait(m);
//		net.Parcourir();
//		
//		
//		System.out.println(m);


	}

}
