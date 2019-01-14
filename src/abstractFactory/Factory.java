package abstractFactory;

public interface Factory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
