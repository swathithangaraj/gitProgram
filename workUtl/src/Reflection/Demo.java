package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ronaldoGT
 *
 */
public class Demo {
	
	public void textReflec() throws Exception{
		
		Class demo = Class.forName("algorithmProblem.PaiXu");

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
