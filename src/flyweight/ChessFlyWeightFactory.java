package flyweight;

import java.util.HashMap;

public class ChessFlyWeightFactory {
	
	private static HashMap<String,ChessFlyWeight> map = new HashMap<String,ChessFlyWeight>();

	public static ChessFlyWeight getChess(String color) {
		if(map.get(color)!=null) {
			return map.get(color);
		}else {
			ChessFlyWeight chess = new ConcreteChess(color);
			map.put(color,chess);
			return chess;
		}
	}
	
	
}
