package observer;

public class Client {

	public static void main(String[] args) {
		ObserverA ob1 = new ObserverA();
		ObserverA ob2 = new ObserverA();
		ConcreteSubject sub = new ConcreteSubject();
		sub.add(ob1);
		sub.add(ob2);
		sub.setState(100);
		System.out.println(ob1.getMystate());
		System.out.println(ob2.getMystate());
	}

}
