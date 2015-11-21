package coom.drizzle.firstjava;
/**
 * 确定一个字符串的所有字符是否全都不同
 * 使用lastindexof（逆序查找某个char在字符串第一次出现的位置）方法，
 * 遍历所有字符的char字符，比较是否不同
 * @author user
 *
 */

public class Different {
	 public boolean checkDifferent(String iniString) {
	       for (int i = 0; i < iniString.length(); i++) {
	    	   if (iniString.lastIndexOf(iniString.charAt(i))!=i) {
				return false;
			}	
		}
	       return true;
	 }
}
