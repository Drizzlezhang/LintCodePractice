package coom.drizzle.firstjava;
/**
 * 有一个机器人的位于一个M×N个网格左上角（下图中标记为'Start'）。
机器人每一时刻只能向下或者向右移动一步。机器人试图达到网格的右下角（下图中标记为'Finish'）。
问有多少条不同的路径？

跟进“不同的路径”：

现在考虑网格中有障碍物，那样将会有多少条不同的路径？

网格中的障碍和空位置分别用1和0来表示。
 * @author user
 *
 */
public class UniquePath {
	 /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
        // write your code here 
    	if (m==0||n==0) {
			return 0;
		}
    	int[][] sum=new int[m][n];
    	for (int i = 0; i < m; i++) {
			sum[i][0]=1;
		}
    	for (int i = 0; i < n; i++) {
			sum[0][i]=1;
		}
    	for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				sum[i][j]=sum[i-1][j]+sum[i][j-1];
			}
		}
    	return sum[m-1][n-1];
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
    	int m=obstacleGrid.length;
    	int n=obstacleGrid[0].length;
    	int[][] paths=new int[m][n];
    	if (obstacleGrid==null||m==0||n==0) {
			return 0;
		}
    	for (int i = 0; i < m; i++) {
			if (obstacleGrid[i][0]!=1) {
				paths[i][0]=1;
			}else{
			    break;
			}
		}
    	for (int i = 0; i < n; i++) {
			if (obstacleGrid[0][i]!=1) {
				paths[0][i]=1;
			}else{
			    break;
			}
		}
    	for (int j = 1; j < m; j++) {
    		for (int j2 = 1; j2 < n; j2++) {
				if (obstacleGrid[j][j2]!=1) {
					paths[j][j2]=paths[j-1][j2]+paths[j][j2-1];
				}else{
					paths[j][j2]=0;
				}
			}
			
		}
    	return paths[m-1][n-1];
    }
}
