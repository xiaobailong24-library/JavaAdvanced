package me.xiaobailong24.polymorphism.interfaces;

/**
 * 2.2.2.基于接口实现的多态
 * 
 * 继承是通过重写父类的同一方法的几个不同子类来体现的，那么就可就是通过实现接口并覆盖接口中同一方法的几不同的类体现的。
 * 
 * 在接口的多态中，指向接口的引用必须是指定这实现了该接口的一个类的实例程序，在运行时，根据对象引用的实际类型来执行对应的方法。
 * 
 * 继承都是单继承，只能为一组相关的类提供一致的服务接口。但是接口可以是多继承多实现，它能够利用一组相关或者不相关的接口进行组合与扩充，
 * 能够对外提供一致的服务接口。所以它相对于继承来说有更好的灵活性。
 * 
 * @author LiuYinlong
 *
 */
public interface WineInterface {
	public String name = null;

	public String drink();

}
