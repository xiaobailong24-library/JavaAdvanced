package me.xiaobailong24.polymorphism.interfaces;

public class JGJInterface implements WineInterface {

	String name = "JGJ";

	@Override
	public String drink() {
		return "�ȵ��� " + name;
	}

	@Override
	public String toString() {
		return "Wine : " + name;
	}

}
