package composite;

public class Client {

	public static void main(String[] args) {
		Folder f1 = new Folder();
		File f2,f3;
		f2 = new TextFile();
		f3 = new ImageFile();
		f1.add(f2);
		f1.add(f3);
		f1.kill();
	}

}
