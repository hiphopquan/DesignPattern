package prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep s1 = new Sheep("doli");
		Sheep s2 = s1.clone();
		System.out.println(s1.getName());
		System.out.println(s2.getName());

	}

}
