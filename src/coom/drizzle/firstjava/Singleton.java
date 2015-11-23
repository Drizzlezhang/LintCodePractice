package coom.drizzle.firstjava;

public class Singleton {
	
	//懒汉式
	 private static Singleton singleton1;
	 public static Singleton getInstance() {
	        // write your code here
		 if (singleton1==null) {
			singleton1=new Singleton();
		}
		 return singleton1;
	    }
	 
	 //饿汉式
	 private static Singleton singleton2=new Singleton();
	 public static synchronized Singleton getSingleton(){
		 return singleton2;
	 }
	 
	 //双重锁定
	 private static Singleton singleton3=null;
	 public static Singleton getSingle(){
		 if (singleton3==null) {
			synchronized (Singleton.class) {
				if (null==singleton3) {
					singleton3=new Singleton();
				}
			}
		}
		 return singleton3;
	 }
	 
//	 private int query(int[] array,int key){
//		 int start=0;
//		 int end=array.length-1;
//		 int mid=0;
//		 
//		 while(start<=end){
//				mid=start+(end-start)/2;
//				if (array[mid]==key) {
//					return mid;
//				}else{
//					if (array[mid]>key) {
//						end=mid-1;
//					}else{
//						start=mid+1;
//					}
//				}
//		 }
//		 return -1;
//	 }

}
