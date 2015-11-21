package coom.drizzle.firstjava;

public class Fibonacci {
	 public int Fib(int n) {
     if (n<0) {
		return -1;
	}
     if (n==0) {
		return 0;
	}
     if (n==1||n==2) {
		return 1;
	}
     int k=3;
     int pre=1;
     int current=1;
     
     while(n<=k){
    	 int temp=pre+current;
    	 pre=current;
    	 current=temp;
    	 k++;
     }
     return current;
		 }
}
