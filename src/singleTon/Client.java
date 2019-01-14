package singleTon;

public class Client {

	public static void main(String[] args) {
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		if(s1==s2) {
			System.out.println("Í¬Ò»¸ö");
		}
	}

}
