package file;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import util.Util;

public class MyText {

	private Util util = new Util();
	private static MyText mt = new MyText();
	/**
	 * @param args
	 * ��װ���Է���
	 */
	public static void main(String[] args) {
		//���������������ݽ��л���������Ҫ����������
		
	}
	
	
	//���(a+aa+aaa+����+b��a)
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
