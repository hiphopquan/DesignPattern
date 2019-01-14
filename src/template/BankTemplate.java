package template;

public abstract class BankTemplate {
	public void takeNumber() {
		System.out.println("ȡ��");
	}
	public abstract void transact();
	public void evaluate() {
		System.out.println("����");
	}
	public void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
