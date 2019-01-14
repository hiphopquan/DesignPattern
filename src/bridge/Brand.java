package bridge;

public interface Brand {

	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("ÁªÏëÅÆ");
		
	}
	
}

class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("´÷¶ûÅÆ");
		
	}
	
}
