package adapter;

public class Client {
	
	public void run(Target t) {
		t.handleRequest();
	}
	public static void main(String[] args) {
		Client c = new Client();
		//Target t = new Adapter();
		Adaptee a = new Adaptee();
		Target t = new Adapter2(a);
		c.run(t);

	}

}
