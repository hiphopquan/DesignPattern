package factory;

public class BydFactory implements Factory {

	@Override
	public Car createCar() {
		Car byd = new Byd();
		return byd;
	}

}
