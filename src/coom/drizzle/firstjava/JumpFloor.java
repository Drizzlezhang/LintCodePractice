package coom.drizzle.firstjava;
/**
 * 一只青蛙一次可以跳上1级台阶，
 * 也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法
 * @author user
 *
 */
public class JumpFloor {
	  public int JumpFloor1(int target) {
          if (target<=0) {
			return 0;
		}else if (target<3) {
			return target;
		}else{
			return JumpFloor1(target-2)+JumpFloor1(target-1);
		}
	    }
	  public int JumpFloor2(int target) {
		  if (target<=0) {
			return -1;
		}else if (target<2) {
			return 1;
		}else{
			return 2*JumpFloor2(target-1);
		}
		  
	  }
}
