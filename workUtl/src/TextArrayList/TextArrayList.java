package TextArrayList;

import java.util.ArrayList;


/**
 * 
 * @author ronaldoGT
 *
 *����ArrayList������ܣ��Լ�����ʵ��
 *
 */
public class TextArrayList {
	
	public void textArrayList(){
		
		ArrayList<String> array = new ArrayList<String>();
		array.ensureCapacity(10);//�˷������ý�����һ�����ٰ���10��������ڲ����飬��array���
		//����<=10����ArrayList���������·���ռ䣬���⻹����ֱ�ӽ��������ݸ�ArrayList���췽�������£�
		ArrayList<String> arrayA = new ArrayList<String>(10);
		array.trimToSize();//�������б�Ĵ洢������������ǰ�ߴ�
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
