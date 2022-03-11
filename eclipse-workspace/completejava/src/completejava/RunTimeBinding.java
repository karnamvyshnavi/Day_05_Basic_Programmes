package completejava;

public class RunTimeBinding {

	public static void main(String[] args) {
		MACBook m1=new MacBookPro();
		m1.start();
		m1.shutdown();
		
		MACBook m2=new MACBookAir();
		m2.start();
		m2.shutdown();
		

	}

}
