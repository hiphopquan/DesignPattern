package decorator;

public interface ICar {
	void move();
}
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("Æû³µ");
		
	}
	
}
class SuperCar implements ICar{

	private ICar car;
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
		
	}
	
}
class FlyCar extends SuperCar{
	
	public FlyCar(ICar car) {
		super(car);
		
	}
	
	public void move() {
		super.move();
		System.out.println("·É»ú");
	}
	
}
class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
		
	}
	
	public void move() {
		super.move();
		System.out.println("ÂÖ´¬");
	}
}
