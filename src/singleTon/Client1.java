package singleTon;

public class Client1 {

	public static void main(String[] args) {
		SingleTon1 s1 = SingleTon1.getInstance();
		SingleTon1 s2 = SingleTon1.getInstance();
		if(s1==s2) {
			System.out.println("Í¬Ò»¸ö");
		}

	}

}
