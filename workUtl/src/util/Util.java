package util;
import java.util.*;


public class Util {

	private static Util util = new Util();
	/**
	 * 该类封装工具类
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * 随机数,
	 * @param min   最小随机数
	 * @param max	 最大随机数
	 * @return
	 */
	public int RandomNumber(int min,int max){
		Random random = new Random();
		int i = random.nextInt(max)%(max-min+1) + min;
		return i;
	}
	
	/**
	 * 输出次方运算
	 * @param x   底数
	 * @param n	     指数
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

}
