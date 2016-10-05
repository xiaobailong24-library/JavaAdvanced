package me.xiaobailong24.collection.map;

import java.util.HashMap;

/**
 * HashMap 也是我们使用非常多的 Collection，它是基于哈希表的 Map 接口的实现，以 key-value 的形式存在。在 HashMap
 * 中，key-value 总是会当做一个整体来处理，系统会根据 hash 算法来来计算 key-value 的存储位置，我们总是可以通过 key
 * 快速地存、取 value。下面就来分析 HashMap 的存取。
 * 
 * 一、定义 HashMap 实现了 Map 接口，继承 AbstractMap。其中 Map 接口定义了键映射到值的规则，而 AbstractMap 类提供
 * Map 接口的骨干实现，以最大限度地减少实现此接口所需的工作，其实 AbstractMap 类已经实现了Map，
 * 
 * @author LiuYinlong
 *
 */
public class HashMapDemo {

	public static void main(String[] args) {

		/**
		 * 定义
		 */
		HashMap<String, String> hm = new HashMap<String, String>();


		/**
		 * 添加元素
		 */
		for (int i = 0; i < 10; i++) {
			hm.put(i + "", i + "");
		}

		/**
		 * 读取元素
		 */
		for (int i = 0; i < hm.size(); i++) {
			System.out.println(i + ": " + hm.get(i + ""));
		}
		
		hm.put("Key", "Value");
		System.out.println("Key: "+hm.get("Key"));

	}
}
