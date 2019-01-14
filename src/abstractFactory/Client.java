package abstractFactory;

public class Client {

	public static void main(String[] args) {
		Factory f1 = new LuxuryFactory();
		Seat s1 = f1.createSeat();
		Engine e1 = f1.createEngine();
		Tyre t1 = f1.createTyre();
		s1.massage();
		e1.run();
		e1.start();
		t1.revolve();
	}

}
