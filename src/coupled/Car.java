package coupled;

public class Car {
	private Tire tire;
	
	public Car() {
		tire=new Tire();
	}
	public void drive() {
		System.out.println("Driving . .");
		tire.turnTire();
	}
}
