package coom.drizzle.firstjava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
实现Comparator接口对String字符串进行比较
 * @author user
 *
 */
public class Shuzupaixu {
	public String PrintMinNumber(int [] numbers) {
		String s="";
		int len=numbers.length;
		if (len==0) {
			return s;
		}
		String[] strings=new String[len];
		for (int i = 0; i < numbers.length; i++) {
			strings[i]=numbers[i]+"";
		}
		Arrays.sort(strings,new C());
		StringBuilder stringBuilder=new StringBuilder();
		for (int i = 0; i < strings.length; i++) {
			stringBuilder.append(strings[i]);
		}
		return stringBuilder.toString();
		
	}
	
	class C implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return (o1+o2).compareTo(o2+o1);
		}
	}
}
