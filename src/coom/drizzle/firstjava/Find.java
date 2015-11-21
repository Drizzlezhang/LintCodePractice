package coom.drizzle.firstjava;
/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
获得二维数组的两个长度。左上角到右下角逐个增大。遍
历数组，目标小于数组的数字则行数加一，大于则列数减一。找到了则返回true。
 * @author user
 *
 */
public class Find {
	public boolean Find(int [][] array,int target) {
		int i=array.length;
		int j=array[0].length;
		if (i==0||j==0) {
			return false;
		}
		if (target<array[0][0]||target>array[i-1][j-1]) {
			return false;
		}
		int m=0;
		int n=j-1;
		while(m<i&&n>=0){
			if (target>array[m][n]) {
				m++;
			}else if (target<array[m][n]) {
				n--;
			}else{
				return true;
			}
		}
		return false;
	}
}
