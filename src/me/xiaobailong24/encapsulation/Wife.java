package me.xiaobailong24.encapsulation;

public class Wife {
	private String name;
	private String sex;
	@SuppressWarnings("unused")
	// û���Ǹ�Ů��Ը�����֪���������䡣
	private int age;
	private Husband husband;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

}
