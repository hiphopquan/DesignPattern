package abstractFactory;

public class MiddleFactory implements Factory {

	@Override
	public Engine createEngine() {
		Engine engine = new MiddleEngine();
		return engine;
	}

	@Override
	public Seat createSeat() {
		Seat seat = new MiddleSeat();
		return seat;
	}

	@Override
	public Tyre createTyre() {
		Tyre tyre = new MiddleTyre();
		return tyre;
	}

}
