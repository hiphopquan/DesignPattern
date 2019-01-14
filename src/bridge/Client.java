package bridge;

public class Client {

	public static void main(String[] args) {
		Computer c1 = new Desktop(new Dell());
		c1.sale();

	}

}
