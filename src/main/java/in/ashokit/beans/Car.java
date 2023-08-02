package in.ashokit.beans;

public class Car {
	
	private IEngine eng;

	public Car() {
		System.out.println("car::constructor");
	}

	public Car(IEngine eng) {
		this.eng = eng;

	}
	
	public void setEng(IEngine eng) {
		this.eng = eng;
		
	}
	
	public void drive() {

		int status = eng.start();

		if (status > 0) {
			System.out.println("driving started...");

		} else {
			System.out.println("Engine issue...");
		}

	}

}
