package factory;

public class AudiFactory implements Factory {

	@Override
	public Car createCar() {
		Car audi = new Audi();
		return audi;

	}

}
