package coom.drizzle.firstjava;
/**
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。
 * 如果不存在，则返回 -1。
 * @author user
 *
 */
public class Strstr {
	 public int strStr(String source, String target) {
	        //write your code here
		 if (source==null||target==null) {
			return -1;
		}
		 for (int i = 0; i < source.length()-target.length()+1; i++) {
			 int j=0;
			for (j = 0; j < target.length(); j++) {
				if (source.charAt(i+j)!=target.charAt(j)) {
					break;
				}
			}
			if (j==target.length()) {
				return i;
			}
			
		}
	        return -1;
	    }
}
