package coom.drizzle.firstjava;
/**
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，
 * 用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。
 * @author user
 *
 */
public class FirstPositiongOfTarget {
	 /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
    	if (nums==null||nums.length==0) {
			return -1;
		}
    	int start = 0,end=nums.length-1;
    	while(start+1<end){
    		int mid=start+(end-start)/2;
    		if (nums[mid]<target) {
				start=mid;
			}else{
				end=mid;
			}
    	}
    	if (nums[start]==target) {
			return start;
		}else if (nums[end]==target) {
			return end;
		}
    	return -1;
    }
}
