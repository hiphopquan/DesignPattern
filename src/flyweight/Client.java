package flyweight;

public class Client {

	public static void main(String[] args) {
		ChessFlyWeight chess = ChessFlyWeightFactory.getChess("��ɫ");
		//chess.getColor();
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("��ɫ");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("��ɫ");
		chess1.display(new Coordinate(10,10));
		chess2.display(new Coordinate(20,20));
		System.out.println(chess);
		System.out.println(chess1);
	}

}
