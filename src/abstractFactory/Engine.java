package abstractFactory;

public interface Engine {
	void run();
	void start();
}

class LuxuryEngine implements Engine {
	public void run() {
		System.out.println("高端发动机转的快");
	}
	public void start() {
		System.out.println("高端发动机自动启停");
	}
}
class MiddleEngine implements Engine {
	public void run() {
		System.out.println("中端发动机转的快");
	}
	public void start() {
		System.out.println("中端发动机自动启停");
	}
}
class LowerEngine implements Engine {
	public void run() {
		System.out.println("低端发动机转的快");
	}
	public void start() {
		System.out.println("低端发动机自动启停");
	}
}