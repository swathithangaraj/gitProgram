package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ������
 * @author ronaldoGT
 *
 */
public class Demo {
	
	public void textReflec() throws Exception{
		//1       �����࣬�������ֽ������ַ�ʽ
		//Class clazz = Class.forName("src.Reflection.Reflec");
		//2
//		Class clazz1 = new Reflec().getClass();
//		//3
//		Class clazz2 = Reflec.class;
		
//		Constructor con = clazz1.getConstructor(null);
//		Reflec ref = (Reflec)con.newInstance(null);
		
		Class demo = Class.forName("file.PaiXu");
		//����Class �����ʾ�����ӿ����������з������������̳еķ���
		//Method m[] = demo.getDeclaredMethods(); 
		//�����̳еķ���
		Method m[] = demo.getMethods(); 
        
        for (int i = 0; i < m.length; i++) {
        	System.out.println(m[i].toString()); 
        }
            
   

	}
	public static void main(String[] args) throws Exception{
		Demo demo =new Demo();
		demo.textReflec();
		
	}
}
