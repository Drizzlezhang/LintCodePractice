package coom.drizzle.firstjava;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 给定一个整数数组，找到和为零的子数组。你的代码应该返回满足要求的子数组的起始位置和结束位置
 * @author user
 *
 */
public class SubarraySum {
	/**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
    	int len=nums.length;
    	ArrayList<Integer> ans=new ArrayList<>();
    	HashMap<Integer, Integer> map=new HashMap<>();
    	
    	map.put(0, -1);
    	
    	int sum=0;
    	for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			if (map.containsKey(sum)) {
				ans.add(map.get(sum)+1);
				ans.add(i);
				return ans;
			}
			map.put(sum, i);
		}
    	return ans;
    }

}
