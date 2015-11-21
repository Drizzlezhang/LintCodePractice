package coom.drizzle.firstjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
 * @author user
 *
 */
public class MajorityNumber {
	public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
		if (nums.size()==0) {
			return 0;
		}
		if (nums.size()==1) {
			return nums.get(0);
		}
		Map<Integer, Integer> map=new HashMap<>();
		for(Integer integer:nums){
			if (map.containsKey(integer)) {
				Integer pre=map.get(integer);
				Integer current=pre+1;
				map.put(integer,current);
				if (current>nums.size()/2) {
					return integer;
				}
			}else{
				map.put(integer, 1);
			}
		}
		return 0;
    }
}
