package me.xiaobailong24.polymorphism.inherit;

public class JNCInherit extends WineInherit {

	public JNCInherit() {
		setName("JNCInherit");
	}

	/**
	 * 重写父类方法，实现多态
	 */
	@Override
	public String drink() {
		return "喝的是 "+getName();
	}

	/**
	 * 重写toString()
	 */
	@Override
	public String toString() {
		return "Wine : "+getName();
	}


	
	
}
