package in.ashokit.beans;

public class DieselEngine implements IEngine {
	public DieselEngine() {
		System.out.println("DeiselEngine::constructor");
	}
	public int start() {
		System.out.println("DeiselEngine is started..");
		return 1;
	}

}
