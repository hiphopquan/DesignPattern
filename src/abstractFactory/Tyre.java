package abstractFactory;

public interface Tyre {
	void revolve();
}

class LuxuryTyre implements Tyre{
	public void revolve() {
		System.out.println("�߶���̥");
	}
}
class MiddleTyre implements Tyre{
	public void revolve() {
		System.out.println("�ж���̥");
	}
}
class LowerTyre implements Tyre{
	public void revolve() {
		System.out.println("�Ͷ���̥");
	}
}