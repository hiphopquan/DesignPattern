package flyweight;

public interface ChessFlyWeight {
	
	void setColor(String c);
	void getColor();
	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight{

	private String color;
	
	@Override
	public void setColor(String c) {
		this.color = c;
		
	}

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void getColor() {
		
		System.out.println(color);
	}

	@Override
	public void display(Coordinate c) {
		System.out.println(color+"Æå×Ó"+"X:"+c.getX()+","+"Y:"+c.getY());
		
	}
	
}