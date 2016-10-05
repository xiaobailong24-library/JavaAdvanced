package me.xiaobailong24.polymorphism.sample;

/**
 * 当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，但是这个被调用的方法必须是在超类中定义过的，
 * 也就是说被子类覆盖的方法。这句话对多态进行了一个概括。
 * 
 * 其实在继承链中对象方法的调用存在一个优先级：this.show(O)、super.show(O)、this.show((super)O)、super.
 * show((super)O)。
 * 
 * @author LiuYinlong
 *
 */
public class Test {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println("1--" + a1.show((A) b)); // "A and A"
		System.out.println("2--" + a1.show((A) c)); // "A and A"
		System.out.println("3--" + a1.show((D) d)); // "A and D"

		System.out.println("4--" + a2.show((A) b)); // "A and A"
		System.out.println("5--" + a2.show((A) c)); // "A and A"
		System.out.println("6--" + a2.show((D) d)); // "A and D"

		System.out.println("7--" + b.show((B) b)); // "B and B"
		System.out.println("8--" + b.show((B) c)); // "B and B"
		System.out.println("9--" + b.show((D) d)); // "A and D"
	}

}
