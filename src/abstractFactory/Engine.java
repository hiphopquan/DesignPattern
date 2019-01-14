package abstractFactory;

public interface Engine {
	void run();
	void start();
}

class LuxuryEngine implements Engine {
	public void run() {
		System.out.println("�߶˷�����ת�Ŀ�");
	}
	public void start() {
		System.out.println("�߶˷������Զ���ͣ");
	}
}
class MiddleEngine implements Engine {
	public void run() {
		System.out.println("�ж˷�����ת�Ŀ�");
	}
	public void start() {
		System.out.println("�ж˷������Զ���ͣ");
	}
}
class LowerEngine implements Engine {
	public void run() {
		System.out.println("�Ͷ˷�����ת�Ŀ�");
	}
	public void start() {
		System.out.println("�Ͷ˷������Զ���ͣ");
	}
}