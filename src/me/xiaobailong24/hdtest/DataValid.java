package me.xiaobailong24.hdtest;

public class DataValid {
	/**
	 * 单例模式
	 */
	private DataValid() {
	}

	private final static DataValid dv = new DataValid();

	/**
	 * 判断数据是否有效
	 * 
	 * @param data
	 * @param checksum
	 * @return
	 */
	public static boolean isValid(String data, String checksum) {
		byte[] dataBytes = hexStringToBytes(data);
		byte dataSum = addData(dataBytes);
		byte[] sumBytes = hexStringToBytes(checksum);
		byte checkSum = addData(sumBytes);
		checkSum = (byte) ~checkSum;

		if (dataSum == checkSum) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 字符串转化为16进制数组
	 * 
	 * @param hexString
	 * @return
	 */
	public static byte[] hexStringToBytes(String hexString) {
		if (hexString == null || hexString.equals("")) {
			return null;
		}
		hexString = hexString.toUpperCase();
		int length = hexString.length() / 2;
		char[] hexChars = hexString.toCharArray();
		byte[] d = new byte[length];
		for (int i = 0; i < length; i++) {
			int pos = i * 2;
			d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
		}
		// 打印数组元素
		for (byte i : d) {
			System.out.println("hexStringToBytes---->" + i);
		}
		return d;
	}

	/**
	 * char 转化为 Byte
	 * 
	 * @param c
	 * @return
	 */
	public static byte charToByte(char c) {
		return (byte) "0123456789ABCDEF".indexOf(c);
	}

	/**
	 * int 数组求和，并保留低 8 位
	 * 
	 * @param byteData
	 * @return
	 */
	public static byte addData(byte[] byteData) {
		int dataSum = 0;
		for (int b : byteData) {
			dataSum += b;
		}
		System.out.println((byte) dataSum);
		return (byte) dataSum;
	}

//	public static void main(String[] args) {
//		boolean b = isValid("80020000", "7D");
//		System.out.println(b);
//	}

}
