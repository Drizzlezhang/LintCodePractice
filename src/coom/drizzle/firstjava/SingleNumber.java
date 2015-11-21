package coom.drizzle.firstjava;
/**
 * 给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字
 * @author user
 *
 */
public class SingleNumber {
	public int singleNumber(int[] A) {
		if (A.length==0) {
			return 0;
		}
		int n=A[0];
		for (int i = 1; i < A.length; i++) {
			n=n^A[i];
		}
		return n;
	}
}
