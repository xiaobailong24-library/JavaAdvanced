package me.xiaobailong24.polymorphism.sample;

public class B extends A {

	public String show(B obj) {
		return ("B and B");
	}

	@Override
	public String show(A obj) {
		return ("B and A");
	}

}
