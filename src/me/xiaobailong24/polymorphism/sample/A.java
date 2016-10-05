package me.xiaobailong24.polymorphism.sample;

public class A {
	public String show(D obj) {
		return ("A and D");
	}
	public String show(A obj) {
		return ("A and A");
	}
	
}
