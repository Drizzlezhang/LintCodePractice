package coom.drizzle.firstjava;
/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * @author user
 *
 */
public class ReverseWords {
	public String reverseWords(String s) {
		if (s==null||s.length()==0) {
			return "";
		}
		String[] array = s.split(" ");
		StringBuilder sBuilder=new StringBuilder();
		for(int i=array.length-1;i>=0;i--){
			if (!array[i].equals("")) {
				sBuilder.append(array[i]).append(" ");
			}
		}
		return sBuilder.length()==0?"":sBuilder.substring(0, sBuilder.length()-1);
	}

}
