package coom.drizzle.firstjava;
/**
 * 字符串翻转
拿到字符串长度，第一个和最后一个调换，以此类推 （ char []数组）
 * @author user
 *
 */
public class Reverse {
	 public String reverseString(String iniString) {
		 int len = iniString.length();
		 char[] cs=iniString.toCharArray();
		 for (int i = 0; i < len/2; i++) {
			char temp=cs[i-1];
			cs[i-1]=cs[i];
			cs[i]=temp;
		}
		 return new String(cs, 0, len);
	 }
	

}
