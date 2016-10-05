package me.xiaobailong24.polymorphism.inherit;

public class InheritTest {

	public static void main(String[] args) {
		// 定义父类数组
		WineInherit[] wines = new WineInherit[2];
		// 定义两个子类
		JNCInherit jnc = new JNCInherit();
		JGJInherit jgj = new JGJInherit();

		// 父类引用子类对象
		wines[0] = jnc;
		wines[1] = jgj;

		for (WineInherit wineInherit : wines) {
			System.out.println(wineInherit.toString() + "---"
					+ wineInherit.drink());
		}
		System.out.println("--------------------------------");
	}

}
