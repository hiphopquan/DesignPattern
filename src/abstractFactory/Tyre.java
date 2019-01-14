package abstractFactory;

public interface Tyre {
	void revolve();
}

class LuxuryTyre implements Tyre{
	public void revolve() {
		System.out.println("¸ß¶ËÂÖÌ¥");
	}
}
class MiddleTyre implements Tyre{
	public void revolve() {
		System.out.println("ÖĞ¶ËÂÖÌ¥");
	}
}
class LowerTyre implements Tyre{
	public void revolve() {
		System.out.println("µÍ¶ËÂÖÌ¥");
	}
}