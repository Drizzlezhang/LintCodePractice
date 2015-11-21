package coom.drizzle.firstjava;
/**
 * 分割一个整数数组，使得奇数在前偶数在后。
 * @author user
 *
 */
public class PartitionArray {
 
   public void partitionArray(int[] nums) {
       // write your code here;
	   int len=nums.length;
	   int[] newnums=new int[len];
	   int start=0;
	   int end=len-1;
	   for (int i = 0; i < nums.length; i++) {
		if (nums[i]%2==0) {
			newnums[end--]=nums[i];
		}else{
			newnums[start++]=nums[i];
		}
	}
	   nums=newnums;
   }
}
