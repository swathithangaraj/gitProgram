package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射类
 * @author ronaldoGT
 *
 */
public class Demo {
	
	public void textReflec() throws Exception{
		//1       加载类，获得类的字节码三种方式
		//Class clazz = Class.forName("src.Reflection.Reflec");
		//2
//		Class clazz1 = new Reflec().getClass();
//		//3
//		Class clazz2 = Reflec.class;
		
//		Constructor con = clazz1.getConstructor(null);
//		Reflec ref = (Reflec)con.newInstance(null);
		
		Class demo = Class.forName("file.PaiXu");
		//返回Class 对象表示的类或接口声明的所有方法，不包含继承的方法
		//Method m[] = demo.getDeclaredMethods(); 
		//包含继承的方法
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
