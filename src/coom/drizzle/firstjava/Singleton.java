package coom.drizzle.firstjava;

public class Singleton {
	private static Singleton singleton;
	 public static Singleton getInstance() {
	        // write your code here
		 if (singleton==null) {
			singleton=new Singleton();
		}
		 return singleton;
		
	    }

}
