package bridge;

public class Computer {
	
	protected Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	
	public void sale() {
		
	}
}

class Desktop extends Computer {

	public Desktop(Brand brand) {
		super(brand);
		
	}
	
	public void sale() {
		brand.sale();
		System.out.println("̨ʽ��");
	}
	
}

class Laptop extends Computer{

	public Laptop(Brand brand) {
		super(brand);
		
	}
	
	public void sale() {
		brand.sale();
		System.out.println("�ʼǱ�");
	}
	
}
