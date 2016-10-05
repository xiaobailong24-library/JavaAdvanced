package me.xiaobailong24.polymorphism.inherit;

public class JGJInherit extends WineInherit {

	public JGJInherit() {
		super.setName("JGJInherit");
	}
	/**
	 * 重写父类方法，实现多态
	 */

	@Override
	public String drink() {
		return "喝的是 "+getName();
	}

	@Override
	public String toString() {
		return "Wine : "+getName();
	}

}
