package template;

public class Client {

	public static void main(String[] args) {
		BankTemplate btm1 = new BankTemplate() {

			@Override
			public void transact() {
				System.out.println("ȡǮ");
				
			}
			
		};
		btm1.process();

	}

}
