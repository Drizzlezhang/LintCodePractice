package coom.drizzle.firstjava;
/**
 * 比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母
 * @author user
 *
 */
public class CompareStrings {
	public boolean compareStrings(String A, String B) {
        // write your code here
		if (A==null||B==null||B.length()>A.length()) {
			return false;
		}
		int[] stra=new int[256];
		int[] strb=new int[256];
		for (int i = 0; i < A.length(); i++) {
			stra[A.charAt(i)]++;
		}
		for (int i = 0; i < B.length(); i++) {
			stra[B.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (strb[i]>stra[i]) {
				return false;
			}
		}
		return true;
    }
}
