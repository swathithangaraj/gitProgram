package util;
import java.util.*;


public class Util {

	private static Util util = new Util();
	/**
	 * �����װ������
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * �����,
	 * @param min   ��С�����
	 * @param max	 ��������
	 * @return
	 */
	public int RandomNumber(int min,int max){
		Random random = new Random();
		int i = random.nextInt(max)%(max-min+1) + min;
		return i;
	}
	
	/**
	 * ����η�����
	 * @param x   ����
	 * @param n	     ָ��
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
