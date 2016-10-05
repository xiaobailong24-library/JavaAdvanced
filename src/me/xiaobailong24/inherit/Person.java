package me.xiaobailong24.inherit;

/**
 * 继承是为了重用父类代码。两个类若存在 IS-A 的关系就可以使用继承。
 * 
 * 同时在使用继承时需要记住三句话：
 * 
 * 1、子类拥有父类非 private 的属性和方法。
 * 
 * 2、子类可以拥有自己属性和方法，即子类可以对父类进行扩展。
 * 
 * 3、子类可以用自己的方式实现父类的方法。（以后介绍）。
 * 
 * @author LiuYinlong
 *
 */
public class Person {

	protected String name;
	protected int age;
	protected String sex;

	public Person(String name) {
		System.out.println("Person Constrctor----" + name);
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getSex() {
		return sex;
	}

	protected void setSex(String sex) {
		this.sex = sex;
	}

	public String toString() {
		return "this name is " + name;
	}

}
