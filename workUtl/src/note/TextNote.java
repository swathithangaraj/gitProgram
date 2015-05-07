package note;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

//import note.JavaNote;

public class TextNote {

	private static final int Integer = 0;

	@JavaNote(getName="ȭ��",getDay=5,number={1,2,3})
	public void textName(String name){
		System.out.println("ȭ��");
	}
	@JavaNote(getName="�ι�",getDay=10,number={4,5,6})
	public void textName2(String name){
		System.out.println("�ι�");
	}
	
	public static void main(String[] args) {
		
		Class cla = TextNote.class;//�õ�TextNote��Ӧ��Class����
		
		Method[] method = cla.getDeclaredMethods();//�õ�TextNote��Ӧ��Method����  
		
		//System.out.println(method.length); 
		for(Method methods : method) {
			JavaNote jn = methods.getAnnotation(JavaNote.class);//��ȡ����������ע��ע�����
			if(jn!=null){
				System.out.println(jn.getName()+jn.getDay()+jn.number()[0]);
			}
		}
		
		
	}

}
