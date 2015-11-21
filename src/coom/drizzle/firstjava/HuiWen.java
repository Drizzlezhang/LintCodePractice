package coom.drizzle.firstjava;

import java.util.ArrayList;

public class HuiWen {
	public boolean isPalindrome(String s) {
        // Write your code here
		if (s==null||s.length()==0) {
			return false;
		}
		char[] cs=s.toCharArray();
		ArrayList<String> list=new ArrayList<>();
		for (int i = 0; i < cs.length; i++) {
			if (cs[i]==' ') {
				continue;
			}else{
				String temp=String.valueOf(cs[i]);
				list.add(temp);
			}
		}
		for (int i = 0; i < list.size()/2; i++) {
			if (list.get(i).equals(list.get(list.size()-1-i))) {
				continue;
			}else{
				return false;
			}
		}
		return true;
    }
}
