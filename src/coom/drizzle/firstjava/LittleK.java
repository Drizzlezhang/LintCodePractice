package coom.drizzle.firstjava;

import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 数组排序
 * @author user
 *
 */
public class LittleK {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> lIntegers=new ArrayList<>();
		int len=input.length;
		if (len==0) {
			return lIntegers;
		}
		if (k>len) {
			return lIntegers;
		}
		sort(input);
		for (int i = 0; i < k; i++) {
			lIntegers.add(input[i]);
		}
		return lIntegers;
	}
	
	//数组排序方法
	private int[] sort(int[] sorts){
		for (int i = 0; i < sorts.length; i++) {
			for (int j = sorts.length-1; j >=i; j--) {
				if (sorts[j]<sorts[j-1]) {
					int temp=sorts[j];
					sorts[j]=sorts[j-1];
					sorts[j-1]=temp;
				}
			}	
		}
		return sorts;
	}
}
