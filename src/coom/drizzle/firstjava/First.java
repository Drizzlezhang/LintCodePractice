package coom.drizzle.firstjava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/**
 * 设计一种方法，将一个字符串中的所有空格替换成 %20 。你可以假设该字符串有足够的空间来加入新的字符，且你得到的是“真实的”字符长度。
 * @author user
 *
 */
public class First {
	  public int replaceBlank(char[] string, int length) {
	        // Write your code here
		    if (length==0) {
				return 0;
			} 
		    int num=0;
		    for (int i = 0; i < length; i++) {
				if (string[i]==' ') {
					num++;
				}
			}
		    int newlen = length+2*num;
		    string[newlen]=0;
		    int j=1;
		    for (int i = length-1; i >= 0; i--) {
		    	if (string[i]!=' ') {
		    		string[newlen-j]=string[i];
		    		j++;
				}else{
					string[newlen-j]='0';
					j++;
					string[newlen-j]='2';
					j++;
					string[newlen-j]='%';
					j++;
				}
				
			}
		    return newlen;
	   }
}

