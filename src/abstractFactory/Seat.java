package abstractFactory;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{
	public void massage() {
		System.out.println("�߶�����");
	}
}
class MiddleSeat implements Seat{
	public void massage() {
		System.out.println("�ж�����");
	}
}
class LowerSeat implements Seat{
	public void massage() {
		System.out.println("�Ͷ�����");
	}
}
