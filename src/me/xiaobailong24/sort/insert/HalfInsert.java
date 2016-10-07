package me.xiaobailong24.sort.insert;


public class HalfInsert {
	/**
	 * 二分法插入排序
	 * 
	 * 基本思想：二分法插入排序的思想和直接插入一样，只是找合适的插入位置的方式不同，这里是按二分法找到合适的位置，可以减少比较的次数。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前：");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 二分法插入排序
		halfSort(a);
		System.out.println("排序之后：");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	private static void halfSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int left = 0;
			int right = i - 1;
			int mid = 0;

			while (left <= right) {
				mid = (left + right) / 2;
				if (temp < a[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			for (int j = i - 1; j >= left; j--) {
				a[j + 1] = a[j];
			}
			if (left != i) {
				a[left] = temp;
			}
		}
	}
}
