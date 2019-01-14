package singleTon;

public class SingleTon1 {
	private static SingleTon1 s;
	private SingleTon1() {
		
	}
	public static SingleTon1 getInstance() {
		if(SingleTon1.s==null) {
			SingleTon1.s = new SingleTon1();
		}
		return SingleTon1.s;
	}
}
