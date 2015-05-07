package TextArrayList;

import java.util.ArrayList;


/**
 * 
 * @author ronaldoGT
 *
 *测试ArrayList类的性能，以及各种实现
 *
 */
public class TextArrayList {
	
	public void textArrayList(){
		
		ArrayList<String> array = new ArrayList<String>();
		array.ensureCapacity(10);//此方法调用将分配一个至少包含10个对象的内部数组，当array里的
		//对象<=10个，ArrayList将不会重新分配空间，另外还可以直接将参数传递给ArrayList构造方法，如下：
		ArrayList<String> arrayA = new ArrayList<String>(10);
		array.trimToSize();//将数组列表的存储容量削减到当前尺寸
	}

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(1);
		Integer b = new Integer(1);
		System.out.println(i==b);
	}

}
