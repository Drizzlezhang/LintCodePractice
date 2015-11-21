package coom.drizzle.firstjava;

import javax.naming.InitialContext;

/**
 * 编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。
 * 若压缩后的字符串没有变短，则返回原先的字符串。
遍历字符串。设定一个初始int=1，如果当前位置的char等于下一个位置的char，且未到字符串最后一位，
那么位置加一，用sb加上当前字符和数字。最后再比较字符串变化前后的长度。
 * @author user
 *
 */
public class Zipper {
	 public String zipString(String iniString) {
	        // write code here
		 if (iniString.length()==0||iniString==null) {
			return null;
		}
		 int len=iniString.length();
		 StringBuilder sBuilder=new StringBuilder();
		 for (int i = 0; i < len; i++) {
			 int count=1;
			 while((i+1)<len&&iniString.charAt(i)==iniString.charAt(i+1)){
				 i++;
				 count++;
			 }
			 sBuilder.append(iniString.charAt(i));
			 sBuilder.append(count);
		
		}
		 String s=sBuilder.toString();
		 if (s.length()>=iniString.length()) {
			 return iniString;
		}else{
			return s;
		}
	    }

}
