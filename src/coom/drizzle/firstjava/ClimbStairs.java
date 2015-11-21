package coom.drizzle.firstjava;

public class ClimbStairs {
	 public int climbStairs(int n) {
	        // write your code here
		 if (n<=1) {
			return n;
		}
		 int last=1;
		 int lastlast=1;
		 int now=0;
		 for (int i = 2; i <=n; i++) {
			now = last + lastlast;
			lastlast=last;
			last=now;
		}
		 return  now;
	    }
}
