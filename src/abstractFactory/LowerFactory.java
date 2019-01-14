package abstractFactory;

public class LowerFactory implements Factory {

	@Override
	public Engine createEngine() {
		Engine engine = new LowerEngine();
		return engine;
	}

	@Override
	public Seat createSeat() {
		Seat seat = new LowerSeat();
		return seat;
	}

	@Override
	public Tyre createTyre() {
		Tyre tyre = new LowerTyre();
		return tyre;
	}

}
