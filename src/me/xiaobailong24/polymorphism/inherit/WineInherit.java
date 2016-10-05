package me.xiaobailong24.polymorphism.inherit;

/**
 * Java 实现多态有三个必要条件：继承、重写、向上转型。
 * 
 * 继承：在多态中必须存在有继承关系的子类和父类。
 * 
 * 重写：子类对父类中某些方法进行重新定义，在调用这些方法时就会调用子类的方法。
 * 
 * 向上转型：在多态中需要将子类的引用赋给父类对象，只有这样该引用才能够具备技能调用父类的方法和子类的方法。
 * 
 * 2.2.1.基于继承实现的多态
 * 
 * 基于继承的实现机制主要表现在父类和继承该父类的一个或多个子类对某些方法的重写，多个子类对同一方法的重写可以表现出不同的行为。
 * 
 * @author LiuYinlong
 *
 */
public class WineInherit {
	private String name;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public WineInherit() {
	}

	public String drink() {
		return "喝的是 " + getName();
	}

	/**
	 * 重写toString()
	 */
	public String toString() {
		return null;
	}

}
