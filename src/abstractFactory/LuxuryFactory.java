package abstractFactory;

public class LuxuryFactory implements Factory {

	@Override
	public Engine createEngine() {
		Engine engine = new LuxuryEngine();
		return engine;
	}

	@Override
	public Seat createSeat() {
		Seat seat = new LuxurySeat();
		return seat;
	}

	@Override
	public Tyre createTyre() {
		Tyre tyre = new LuxuryTyre();
		return tyre;
	}

}
