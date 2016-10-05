package me.xiaobailong24.polymorphism.inherit;

public class InheritTest {

	public static void main(String[] args) {
		// ���常������
		WineInherit[] wines = new WineInherit[2];
		// ������������
		JNCInherit jnc = new JNCInherit();
		JGJInherit jgj = new JGJInherit();

		// ���������������
		wines[0] = jnc;
		wines[1] = jgj;

		for (WineInherit wineInherit : wines) {
			System.out.println(wineInherit.toString() + "---"
					+ wineInherit.drink());
		}
		System.out.println("--------------------------------");
	}

}
