package coom.drizzle.firstjava;
/**
 * 确定其中一个字符串的字符重新排列后，能否变成另一个字符串
给定两个长度为256的数组，遍历字符串，遍历到数组对应字符串char位置时，
该位置数字加一。
遍历数组，比较两个数组对应位置的数字，有不同的则返回false。
 * @author user
 *
 */
public class Same {
    public boolean checkSam(String stringA, String stringB) {
    	int lena=stringA.length();
    	int lenb=stringB.length();
    	if (lena!=lenb) {
			return false;
		}
    	int[] stra=new int[256];
    	int[] strb=new int[256];
    	for (int i = 0; i < lena; i++) {
			stra[stringA.charAt(i)]++;
			strb[stringB.charAt(i)]++;
		}
    	for (int j = 0; j < 256; j++) {
			if (stra[j]!=strb[j]) {
				return false;
			}
		}
    	return true;
    }
}
