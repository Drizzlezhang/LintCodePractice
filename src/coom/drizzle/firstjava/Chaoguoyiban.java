package coom.drizzle.firstjava;
/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
数组进行排序，找出中间的数字即可
 * @author user
 *
 */
public class Chaoguoyiban {
	public int MoreThanHalfNum_Solution(int [] array) {
		if (array.length==0) {
			return 0;
		}
		if (array.length==1) {
			return array[0];
		}
		//数组排序方法
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length-1; j >=i; j--) {
				if (array[j]<array[j-1]) {
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		if (array[array.length/2]!=array[array.length/2+1]) {
			return 0;
		}
		else{
			return array[array.length/2];
		}
	}
}
