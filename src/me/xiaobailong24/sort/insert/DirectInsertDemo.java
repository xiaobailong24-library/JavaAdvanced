package me.xiaobailong24.sort.insert;

public class DirectInsertDemo {
	/**
	 * 直接插入排序
	 * 基本思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 初始状态 ：49,38,65,97,76,13,27,49,78,34,12,64,1
		 */
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// 直接插入排序
		// long time1 = System.currentTimeMillis();
		for (int i = 0; i < a.length; i++) {
			// 待插入元素
			int temp = a[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				// 将大于temp的往后移动一位
				if (a[j] > temp) {
					a[j + 1] = a[j];
				} else {
					break;
				}
			}
			a[j + 1] = temp;
		}
		// long time2 = System.currentTimeMillis();
		System.out.println();
		System.out.println("排序之后：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// System.out.println("排序时间：" + (time2 - time1));

	}

}
