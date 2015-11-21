package coom.drizzle.firstjava;

/**
 * 定一个未排序的整数数组，找到其中位数。
中位数是排序后数组的中间值，如果数组的个数是偶数个，则返回排序后数组的第N/2个数。
 * @author user
 */

public class Median {
	 public int median(int[] nums) {
	        // write your code here
		 if (nums.length==0) {
			return 0;
		}
		 if (nums.length==1) {
			return nums[0];
		}
		 sort(nums);
         int len=nums.length;
         if (len%2==0) {
			return nums[(len/2)-1];
		}else{
			return nums[(len-1)/2];
		}
	    }
	 
	 private void sort(int[] sums){
		 int len=sums.length;
		 for (int i = 0; i < len; i++) {
			 for (int j = len-1; j >i; j--) {
				if (sums[j]<sums[j-1]) {
					int temp=sums[j];
					sums[j]=sums[j-1];
					sums[j-1]=temp;
				}
			}
		}
	 }
}
