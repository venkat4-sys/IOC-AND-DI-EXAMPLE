package in.ashokit.beans;

public class PetrolEngine implements IEngine{
	
	public PetrolEngine() {
		System.out.println("PetrolEngine::constructor");
	}
	
	public int start() {
	System.out.println("Petrol Engine started...");
		return 1;
	}

}
