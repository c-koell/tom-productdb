package at.stams.tomi.hunde;

public abstract class AbstractHund implements Hund {

	public AbstractHund() {
		super();
	}

	@Override
	public void belle() {
		System.out.println("wuff");
	}

	@Override
	public void machSitz() {
		System.out.println("sitz");
	}

	@Override
	public void spring() {
		System.out.println("spring");
	}
}