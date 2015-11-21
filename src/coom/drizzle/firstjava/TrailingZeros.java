package coom.drizzle.firstjava;
/**
 * 计算出n阶乘中尾部零的个数
 * @author user
 *
 */
public class TrailingZeros {
	public long trailingZeros(long n) {
        // write your code here
		long sum=0;
		while(n!=0){
			sum+=n/5;
			n/=5;
		}
		return sum;
    }
}
