package me.xiaobailong24.polymorphism.wine;

/**
 * 指向子类的父类引用由于向上转型了，它只能访问父类中拥有的方法和属性，而对于子类中存在而父类中不存在的方法，该引用是不能使用的，
 * 尽管是重载该方法。 若子类重写了父类中的某些方法，在调用该些方法的时候， 必定是使用子类中定义的这些方法（动态连接、动态调用）。
 * 
 * @author LiuYinlong
 *
 */
public class Test {

	public static void main(String[] args) {
		Wine w = new JNC();
		w.func1();
	}
}
