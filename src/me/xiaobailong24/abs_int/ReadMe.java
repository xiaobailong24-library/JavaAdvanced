package me.xiaobailong24.abs_int;

public class ReadMe {
	/**
	 * 在语法层次，java 语言对于抽象类和接口分别给出了不同的定义。下面已 Demo 类来说明他们之间的不同之处。
	 * 
	 * 使用抽象类来实现:
	 * 
	 * 
	 * public abstract class Demo { abstract void method1();
	 * 
	 * void method2(){ //实现 } } 使用接口来实现
	 * 
	 * 
	 * interface Demo { void method1(); void method2(); }
	 * 抽象类方式中，抽象类可以拥有任意范围的成员数据
	 * ，同时也可以拥有自己的非抽象方法，但是接口方式中，它仅能够有静态、不能修改的成员数据（但是我们一般是不会在接口中使用成员数据
	 * ），同时它所有的方法都必须是抽象的。在某种程度上来说，接口是抽象类的特殊化。
	 * 
	 * 对子类而言，它只能继承一个抽象类（这是 java 为了数据安全而考虑的），但是却可以实现多个接口。
	 */

	/**
	 * 上面只是从语法层次和编程角度来区分它们之间的关系，这些都是低层次的，要真正使用好抽象类和接口，我们就必须要从较高层次来区分了。
	 * 只有从设计理念的角度才能看出它们的本质所在。一般来说他们存在如下三个不同点：
	 * 
	 * 1、 抽象层次不同。抽象类是对类抽象，而接口是对行为的抽象。抽象类是对整个类整体进行抽象，包括属性、行为，但是接口却是对类局部（行为）进行抽象。
	 * 
	 * 2、 跨域不同。抽象类所跨域的是具有相似特点的类，而接口却可以跨域不同的类。我们知道抽象类是从子类中发现公共部分，然后泛化成抽象类，
	 * 子类继承该父类即可，但是接口不同。实现它的子类可以不存在任何关系，共同之处。例如猫、狗可以抽象成一个动物类抽象类，具备叫的方法。鸟、飞机可以实现飞
	 * Fly 接口
	 * ，具备飞的行为，这里我们总不能将鸟、飞机共用一个父类吧！所以说抽象类所体现的是一种继承关系，要想使得继承关系合理，父类和派生类之间必须存在
	 * "is-a"关系，即父类和派生类在概念本质上应该是相同的。对于接口则不然，并不要求接口的实现者和接口定义在概念本质上是一致的，
	 * 仅仅是实现了接口定义的契约而已。
	 * 
	 * 3、 设计层次不同。对于抽象类而言，它是自下而上来设计的，我们要先知道子类才能抽象出父类，而接口则不同，它根本就不需要知道子类的存在，
	 * 只需要定义一个规则即可，至于什么子类、什么时候怎么实现它一概不知。比如我们只有一个猫类在这里，如果你这是就抽象成一个动物类，
	 * 是不是设计有点儿过度？我们起码要有两个动物类
	 * ，猫、狗在这里，我们在抽象他们的共同点形成动物抽象类吧！所以说抽象类往往都是通过重构而来的！但是接口就不同
	 * ，比如说飞，我们根本就不知道会有什么东西来实现这个飞接口
	 * ，怎么实现也不得而知，我们要做的就是事前定义好飞的行为接口。所以说抽象类是自底向上抽象而来的，接口是自顶向下设计出来的。
	 */
}
