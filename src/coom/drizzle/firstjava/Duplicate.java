package coom.drizzle.firstjava;

import java.util.HashMap;
import java.util.Map;
/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 
 * @author user
 *
 */
public class Duplicate {
	 public boolean duplicate(int numbers[],int length,int [] duplication) {
		 if (length==0) {
			return false;
		}
		    Map<Integer, Integer> map=new HashMap<>();
		    for (int i = 0; i < length; i++) {
		    	if (map.containsKey((Integer)numbers[i])) {
					duplication[0]=numbers[i];
					return true;
				}else{
					map.put((Integer)numbers[i], 1);
				}
			}
		    return false;
	    }

}
