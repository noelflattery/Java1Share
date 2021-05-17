
public class Bird implements Behaviour,Movement,Conditions{

	@Override
	public void hungry() {
		System.out.println("bird hungry");
		
	}

	@Override
	public void thirsty() {
		System.out.println("bird thirsty");
	}

	@Override
	public void tired() {
		System.out.println("bird tired");
		
	}

	@Override
	public void walk() {
		System.out.println("bird walk");
		
	}

	@Override
	public void sad() {
		System.out.println("sad");
		
	}

}
