package coom.drizzle.firstjava;

import java.util.ArrayList;

public class LongestWords {
	public ArrayList<String> longestWords(String[] dictionary) {
	        // write your code here
		ArrayList<String> list=new ArrayList<>();
		if (dictionary==null||dictionary.length==0) {
			return list;
		}
		int maxlength=0;
		for (int i = 0; i < dictionary.length; i++) {
			if (dictionary[i].length()>maxlength) {
				maxlength=dictionary[i].length();
			}else{
				continue;
			}
		}
		for (int i = 0; i < dictionary.length; i++) {
			if (dictionary[i].length()==maxlength) {
				list.add(dictionary[i]);
			}
		}
		return list;
		 
	    }
}
