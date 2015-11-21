package coom.drizzle.firstjava;
/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
遍历字符串，获得对应char，如果为空格则append“%20”
 * @author user
 *
 */
public class Solution {
	 public String replaceSpace(StringBuffer str) {
		 StringBuilder sb=new StringBuilder();
		 int len=str.length();
		 for (int i = 0; i < len; i++) {
			 char c=str.charAt(i);
			 if (c==' ') {
				sb.append("%20");
			}else{
				sb.append(c);
			}
		}
		 return sb.toString();
	    	
	    }

}
