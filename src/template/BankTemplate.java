package template;

public abstract class BankTemplate {
	public void takeNumber() {
		System.out.println("È¡ºÅ");
	}
	public abstract void transact();
	public void evaluate() {
		System.out.println("ÆÀ¹À");
	}
	public void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
