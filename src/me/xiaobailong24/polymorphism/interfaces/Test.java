package me.xiaobailong24.polymorphism.interfaces;


public class Test {

	public static void main(String[] args) {
		// 定义两个子类
		JNCInterface jnc = new JNCInterface();
		JGJInterface jgj = new JGJInterface();

		System.out.println(jnc.toString() + "---" + jnc.drink());
		System.out.println(jgj.toString() + "---" + jgj.drink());
		System.out.println("--------------------------------");
	}

}
