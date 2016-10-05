package me.xiaobailong24.polymorphism.interfaces;

public class JNCInterface implements WineInterface {

	String name = "JNC";

	@Override
	public String drink() {
		return "ºÈµÄÊÇ " + name;
	}

	@Override
	public String toString() {
		return "Wine : " + name;
	}

}
