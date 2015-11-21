package coom.drizzle.firstjava;

public class RotateString {
	 public void rotateString(char[] str, int offset) {
	        // write your code here
		 if (str==null||str.length==0) {
			return;
		}
		 offset=offset%str.length;
		 reverse(str, 0,str.length-offset-1 );
		 reverse(str, str.length-offset, str.length-1);
		 reverse(str, 0, str.length-1);
	    }
	 //旋转字符串方法
	 private void reverse(char[] A,int start,int end){
		 for (int i = start,j=end; i < j; i++,j--) {
			char temp=A[i];
			A[i]=A[j];
			A[j]=temp;
		}
	 }
}
