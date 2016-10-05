package me.xiaobailong24.inherit;

public class Husband extends Person {
	@SuppressWarnings("unused")
	private Wife wife;

	public Husband() {
		super("chenssy");
		System.out.println("Husband Constructor...");
	}

	@Override
	public String toString() {
		setName("chensy");
		return super.toString();
	}

	public static void main(String[] args) {
		Husband h = new Husband();
		System.out.println(h.toString());
	}

}
