package algorithmProblem;

/**
 * 矩阵 
 * @author ronaldoGT
 *
 */
public class Matrix {

	private static int[][] matrix ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix objMatrix = new Matrix();
		//objMatrix.snakeMatrix(7);
		//objMatrix.loopMatrix(7);
		//objMatrix.snakeMatrix2(7);
		objMatrix.loop(7);
		for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
	}
	
	public void loop(int n){
		matrix = new int[n][n];
		int x=0,y=0;
		for(int i = 1; i <= n*n; i++){
			matrix[x][y] = i;
			//System.out.println("x="+x+",y="+y+",xy="+i);
			if(x+1<n&&matrix[x+1][y]==0){
				if(y-1>=0&&matrix[x+1][y-1]==0){
					x++;
				}
			}else if(y+1<n&&matrix[x][y+1]==0){
				y++;
			}else if(x-1>=0&&matrix[x-1][y]==0){
				x--;
			}else if(y-1>=0&&matrix[x][y-1]==0){
				y--;
			}
		}
	}
	
	/**
	 *  1 44 43 32 31 20 19 
		2 45 42 33 30 21 18 
		3 46 41 34 29 22 17 
		4 47 40 35 28 23 16 
		5 48 39 36 27 24 15 
		6 49 38 37 26 25 14 
		7  8  9 10 11 12 13
	 */
	public void snakeMatrix2(int n){
		matrix = new int[n][n];
		int x=0,y=0;
		for(int i = 1; i <= n*n; i++){
			matrix[x][y] = i;
			//System.out.println("x="+x+",y="+y+",xy="+i);
			if(x+1<n&&matrix[x+1][y]==0){
				x++;
			}else if(y+1<n&&matrix[x][y+1]==0){
				y++;
			}else if(x-1>=0&&matrix[x-1][y]==0){
				x--;
			}else if(y-1>=0&&matrix[x][y-1]==0){
				y--;
			}
		}
	}
	
	/**
	 * 蛇形矩阵
	 * @param n
	 * 
	 *   1  3  4 10 11 21 22 
		 2  5  9 12 20 23 34 
		 6  8 13 19 24 33 35 
		 7 14 18 25 32 36 43 
		15 17 26 31 37 42 44 
		16 27 30 38 41 45 48 
		28 29 39 40 46 47 49
	 */
	public void snakeMatrix(int n){
		matrix = new int[n][n];	
		int x = 0, y = 0,m = 1;
		boolean isRow = false;
		for(int i = 0;i < (2*n-1);i++){
			x = i;
			while(x >= ((i < n) ? 0 : i-n+1)){
				if(x > (n-1)){
					x = n-1;
				}
				y = i-x;
				if(isRow){
					matrix[x][y] = m;
				}
				else{
					matrix[y][x] = m;
				}
				m++;
				x--;
			}
			isRow = !isRow;
		}
	}
	
	/**
	 * 大回环矩阵
	 * @param n
	 *  1 24 23 22 21 20 19 
		2 25 40 39 38 37 18 
		3 26 41 48 47 36 17 
		4 27 42 49 46 35 16 
		5 28 43 44 45 34 15 
		6 29 30 31 32 33 14 
		7  8  9 10 11 12 13
	 */
	public void loopMatrix(int n){
		matrix = new int[n][n];  
		for (int num = 1, x = 0, y = 0, xDir = 1, yDir = 0; num <= n * n; num++) {  
			 matrix[x][y] = num;  
		     if (x + xDir < 0 || y + yDir < 0 || x + xDir == n || y + yDir == n || matrix[x + xDir][y + yDir] != 0) {//边界条件 
		         if (xDir != 0) {  
		             yDir = xDir;  
		             xDir = 0;  
		         } else {  
		             xDir = -yDir;
		             yDir = 0;  
		         }  
		     }  
		     x += xDir;  
		     y += yDir;  
		} 
	}	
}


