package util;
import java.util.*;


public class Util {

	private static Util util = new Util();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	//(a+aa+aaa+...+b个a)
	private int twoNumber(int a,int b){
		int sum = 0;
		int i = 0;
		int one = 0;
		for(i=0;i<b;i++){
			int m = util.power(10,i);
			//int m = (int)Math.pow(a, i);
			sum+=m*a;
			one+=sum;		
		}
		return one;
	} 
	
	/**
	 * 生成指定区间随机数,(min,max)
	 * @param min   
	 * @param max	
	 * @return
	 */
	public int RandomNumber(int min,int max){
		Random random = new Random();
		int i = random.nextInt(max)%(max-min+1) + min;
		return i;
	}
	
	/**
	 * 次方
	 * @param x   底数
	 * @param n	   指数
	 * @return
	 */
	public int power(int x,int n){
		int sum = 1;
		while(n>0){
			sum *= x;
			n--;
		}
		return sum;
	}

	/**
	 * 阶乘
	 * @param i
	 * @return
	 */
	public int jieChen(int i){
		int sum=1;
		if(i>0){
			sum=i*(jieChen(--i));
		}
		return sum;
	}
}
