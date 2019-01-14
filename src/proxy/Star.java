package proxy;

public interface Star {
	void bookTicket();
	void signContact();
	void sing();
}

class Proxy implements Star{

	private RealStar star;
	
	public Proxy(RealStar star) {
		super();
		this.star = star;
	}

	@Override
	public void bookTicket() {
		System.out.println("����Ʊ");
		
	}

	@Override
	public void signContact() {
		System.out.println("����ǩ��ͬ");
		
	}

	@Override
	public void sing() {
		star.sing();
		
	}
	
}

class RealStar implements Star{
	
	private String name;
	
	public RealStar(String name) {
		super();
		this.name = name;
	}

	@Override
	public void bookTicket() {
		System.out.println(name+"��Ʊ");
		
	}

	@Override
	public void signContact() {
		System.out.println(name+"ǩ��ͬ");
		
	}

	@Override
	public void sing() {
		System.out.println(name+"����");
		
	}
	
}
