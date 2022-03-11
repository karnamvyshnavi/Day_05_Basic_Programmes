package completejava;

public class MACBookAir extends MACBook {
	
	@Override
	void start() {
		System.out.println("Inside MACBookAir start method");
	}

	@Override
	void shutdown() {
		System.out.println("Inside MACBookAir shutdown method");
	}
	
}
