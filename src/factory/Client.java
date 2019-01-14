package factory;

public class Client {
	public static void main(String [] args){
		Factory f1 = new AudiFactory();
		Car c1 = f1.createCar();
		c1.run();
		Factory f2 = new BydFactory();
		Car c2 = f2.createCar();
		c2.run();
		
	}

}
