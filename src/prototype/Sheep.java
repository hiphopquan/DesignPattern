package prototype;

public class Sheep implements Cloneable{
	
	private String name;
	
	protected Sheep clone() throws CloneNotSupportedException {
		Sheep obj = (Sheep)super.clone();
		return obj;
	}

	public Sheep(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
