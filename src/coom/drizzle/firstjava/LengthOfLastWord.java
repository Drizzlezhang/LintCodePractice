package coom.drizzle.firstjava;
/**
 * 一个字符串最后一个单词的长度
 * @author user
 *
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // Write your code here
    	char[] cs=s.toCharArray();
    	int num=0;
    	for (int i = s.length()-1; i >=0; i--) {
			if (num==0) {
				if (cs[i]==' ') {
					continue;
				}else{
					num++;
				}
			}else{
				if (cs[i]==' ') {
					break;
				}else{
					num++;
				}
			}
		}
    	return num;
    }

}
