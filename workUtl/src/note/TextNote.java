package note;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

//import note.JavaNote;

public class TextNote {

	private static final int Integer = 0;

	@JavaNote(getName="拳皇",getDay=5,number={1,2,3})
	public void textName(String name){
		System.out.println("拳皇");
	}
	@JavaNote(getName="宋工",getDay=10,number={4,5,6})
	public void textName2(String name){
		System.out.println("宋工");
	}
	
	public static void main(String[] args) {
		
		Class cla = TextNote.class;//得到TextNote对应的Class对象
		
		Method[] method = cla.getDeclaredMethods();//得到TextNote对应的Method数组  
		
		//System.out.println(method.length); 
		for(Method methods : method) {
			JavaNote jn = methods.getAnnotation(JavaNote.class);//获取方法上所标注的注解对象
			if(jn!=null){
				System.out.println(jn.getName()+jn.getDay()+jn.number()[0]);
			}
		}
		
		
	}

}
