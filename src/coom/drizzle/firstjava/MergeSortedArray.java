package coom.drizzle.firstjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * @author user
 *
 */
public class MergeSortedArray {
	 public ArrayList<Integer> mergeSortedArray(ArrayList<Integer> A, ArrayList<Integer> B) {
	        // write your code here
	        for (int i = 0; i < A.size(); i++) {
				B.add(A.get(i));
			}
	        Collections.sort(B);
	        return B;
	    }
	  public void mergeSortedArray(int[] A, int m, int[] B, int n) {
	        // write your code here
		  int i=m-1,j=n-1,index=m+n-1;
		  while(i>=0&&j>=0){
			  if (A[i]>B[j]) {
				A[index--]=A[i--];
			}else{
				A[index--]=B[j--];
			}
		  }
		  while(i>=0){
			  A[index--]=A[i--];
		  }
		  while(j>=0){
			  A[index--]=B[j--];
			  }
	    }
}
