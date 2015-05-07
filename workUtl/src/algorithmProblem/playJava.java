package algorithmProblem;

import java.util.List;

public class playJava {
	
	private int idg=0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	/**
	 * 杨辉三角
	 * @param n
	 */
	public void yangHui(int n){
		int[][] array=new int[n][2*n+1];
		for(int i=0;i<n;i++){
			for(int j=0;j<=2*n;j++){
				if(i+j==n||j-i==n){
					array[i][j]=1;
				}else if(i+j>n&&j-i<n){
					array[i][j]=array[i-1][j-1]+array[i-1][j+1];
				}
				
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<=2*n;j++){
				if(array[i][j]==0){
					System.out.print(" ");
				}else{
					System.out.print(array[i][j]);
				}	
			}
			System.out.println();
		}
	}
}
