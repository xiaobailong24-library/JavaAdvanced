package me.xiaobailong24.hdtest;

public class BytesUtil {
	/**
	 * Convert byte[] to hex string. ���ֽ�����ת��Ϊ�ַ���
	 * �������ǿ��Խ�byteת����int��Ȼ������Integer.toHexString(int)��ת����16�����ַ�����
	 * 
	 * @param src
	 *            byte[] data
	 * @return hex string
	 */
	public static String bytesToHexString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder("");
		if (src == null || src.length <= 0) {
			return null;
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv + " ");
		}
		return stringBuilder.toString();
	}

	/**
	 * Convert hex string to byte[] ��Ϊ�ַ���ת��Ϊ�ֽ�����
	 * 
	 * @param hexString
	 *            the hex string
	 * @return byte[]
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
		return d;
	}

	/**
	 * Convert char to byte
	 * 
	 * @param c
	 *            char
	 * @return byte
	 */
	private static byte charToByte(char c) {
		return (byte) "0123456789ABCDEF".indexOf(c);
	}

	
	public static void main(String[] args) {
		byte b1 = 11;  
        byte b2 = 21;  
        byte b3 = 31;  
        byte b4 = 41;  
        byte b5 = 51;  
        byte b6 = 61;  
        byte b7 = 71;  
        byte b8 = 81;  
        byte[] bytes = new byte[] { b1, b2, b3, b4, b5, b6, b7, b8 };  
        String hexString = "0b151f29333d4751";  
        String str = BytesUtil.bytesToHexString(bytes);  
        System.out.println("str--->" + str);  
        byte[] hexStringToBytes = BytesUtil.hexStringToBytes(hexString);  
        for (int i = 0; i < hexStringToBytes.length; i++) {  
            System.out.println("hexStringToBytes---->" + hexStringToBytes[i]);  
        }  
	}


}