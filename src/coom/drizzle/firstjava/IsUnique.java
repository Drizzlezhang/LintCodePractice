package coom.drizzle.firstjava;
/**
 * 实现一个算法确定字符串中的字符是否均唯一出现
 * @author user
 *
 */
public class IsUnique {
	 public boolean isUnique(String str) {
	        // write your code here
		 if (str==null||str.length()==0) {
			return false;
		}
		 if (str.length()==1) {
			return true;
		}
		 char[] cs=str.toCharArray();
		 int[] is=new int[256];
		 for (int i = 0; i < str.length(); i++) {
			is[(int)str.charAt(i)]++;
			if (is[(int)str.charAt(i)]>1) {
				return false;
			}
		}
		 return true;
		 
	    }

}
