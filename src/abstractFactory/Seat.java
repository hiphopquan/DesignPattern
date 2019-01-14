package abstractFactory;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{
	public void massage() {
		System.out.println("¸ß¶Ë×ùÒÎ");
	}
}
class MiddleSeat implements Seat{
	public void massage() {
		System.out.println("ÖĞ¶Ë×ùÒÎ");
	}
}
class LowerSeat implements Seat{
	public void massage() {
		System.out.println("µÍ¶Ë×ùÒÎ");
	}
}
