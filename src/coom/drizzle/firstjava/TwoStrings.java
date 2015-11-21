package coom.drizzle.firstjava;
/**
 * 去判断两个字符串是否是颠倒字母顺序构成的
 * @author user
 *
 */
public class TwoStrings {
	/**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if (s.length()!=t.length()) {
			return false;
		}
        int[] count=new int[256];
        for (int i = 0; i < s.length(); i++) {
			count[(int)s.charAt(i)]++;
		}
        for (int i = 0; i < t.length(); i++) {
			count[(int)t.charAt(i)]--;
		}
        for (int i = 0; i < count.length; i++) {
			if (count[i]<0) {
				return false;
			}
		}
        return true;
    }

}
