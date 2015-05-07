package file;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import util.Util;

public class MyText {

	private Util util = new Util();
	private static MyText mt = new MyText();
	/**
	 * @param args
	 * 封装测试方法
	 */
	public static void main(String[] args) {
		//对两个变量的数据进行互换。不需要第三方变量
		
	}
	
	
	//输出(a+aa+aaa+……+b个a)
	private void twoNumber(int a,int b){
		int sum = 0;
		int i = 0;
		int one = 0;
		for(i=0;i<b;i++){
			int m = util.power(10,i);
			//int m = (int)Math.pow(a, i);
			sum+=m*a;
			one+=sum;
			System.out.println(one);
		}
	} 
	
	

}
