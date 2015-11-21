package coom.drizzle.firstjava;

import java.awt.List;
import java.util.ArrayList;

/**
 * 给定一个数组和一个值，在原地删除与值相同的数字，返回新数组的长度。
元素的顺序可以改变，并且对新的数组不会有影响。
 * @author user
 *
 */
public class RemoveElement {
	/**
	 * 给定一个数组和一个值，在原地删除与值相同的数字，返回新数组的长度。
	元素的顺序可以改变，并且对新的数组不会有影响。
	 * @author user
	 *
	 */
    public int removeElement(int[] A, int elem) {
        // write your code here
       ArrayList<Integer> arrayList=new ArrayList<>();
       for (int i = 0; i < A.length; i++) {
		if (A[i]!=elem) {
			arrayList.add((Integer)A[i]);
		}
	}
       int[] B=new int[arrayList.size()];
       for (int i = 0; i < arrayList.size(); i++) {
		B[i]=arrayList.get(i);
	}
       return B.length;
    	
    }
    /**
     * 给定一个排序数组，在原数组中删除重复出现的数字，使得每个元素只出现一次，并且返回新的数组的长度。
不要使用额外的数组空间，必须在原地没有额外空间的条件下完成。
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
    	if (nums==null||nums.length==0) {
			return 0;
		}
    	int size=0;
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=nums[size]) {
				nums[++size]=nums[i];
			}
		}
    	return size+1;
    }
    
    /**
     * 如果可以允许出现两次重复将如何处理？
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
    	
    }

}
