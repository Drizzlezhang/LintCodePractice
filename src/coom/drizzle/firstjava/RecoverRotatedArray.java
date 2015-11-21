package coom.drizzle.firstjava;

import java.util.ArrayList;

/**
 * 给定一个旋转排序数组，在原地恢复其排序。
 * @author user
 *
 */
public class RecoverRotatedArray {
	  public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
	        // write your code
		  for (int i = 0; i < nums.size(); i++) {
			  for (int j = nums.size()-1; j >i; j--) {
				  if (nums.get(j)<nums.get(j-1)) {
					int temp=nums.get(j);
					 int tem=nums.get(j-1);
					 nums.set(j, tem);
					 nums.set(j-1, temp);
				}
			}	
		}  
	    }
}
