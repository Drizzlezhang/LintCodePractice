package coom.drizzle.firstjava;
/**
 * 将一个整数中的数字进行颠倒，当颠倒后的整数溢出时，返回 0 (标记为 32 位整数)。
 * @author user
 *
 */
public class ReverseInteger {
	public int reverse(int x) {
		int rst=0;
		while(x!=0){
			int next_rst=rst*10+x%10;
			x=x/10;
			if (next_rst/10!=rst) {
				rst=0;
				break;
			}
			rst=next_rst;
		}
		return rst;
	}

}
