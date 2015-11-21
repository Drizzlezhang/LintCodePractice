package coom.drizzle.firstjava;

public class PlusOne {
	 public int[] plusOne(int[] digits) {
	        // Write your code here
		 if (digits==null||digits.length==0) {
			return digits;
		}
		 long digit=0;
		 for (int i = 0; i < digits.length; i++) {
				digit=(long) (digit+digits[i]*Math.pow(10,digits.length-i-1));
		}
		 long newdigit=digit+1;
		 String string=newdigit+"";
		 int len=string.length();
		 int[] plus=new int[len];
		 for (int i = 0; i < plus.length; i++) {
				 plus[i]=Integer.parseInt(string.charAt(i)+"");
		}
		 return plus;
	    }
}
