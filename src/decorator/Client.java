package decorator;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		FlyCar flyCar = new FlyCar(new WaterCar(car));
		flyCar.move();

	}

}
