package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class DongTaiBianYi {

	/**
	 * @param args
	 * @throws Exception 
	 * ��-824.40	-824.40	
	 */
	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		DongTaiBianYi dtby = new DongTaiBianYi();
		//dtby.textJavaCompiler();
		//dtby.textStringWrite();
	
	}

	public void textJavaCompiler() throws IOException{
		// �������
		JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
		int result = javaCompiler.run(null, null, null, "-d","./src/","./src/file/MyText.java");
        System.out.println( result == 0 ? "��ϲ����ɹ�" : "�Բ������ʧ��");
        
	}
	
	public void textStringWrite() throws Exception{
		JavaCompiler complier = ToolProvider.getSystemJavaCompiler();     
        StandardJavaFileManager sjf =   
                complier.getStandardFileManager(null, null, null);  
        Iterable it = sjf.getJavaFileObjects("D:/Hello.java");
        CompilationTask task = complier.getTask(null, sjf, null, null, null, it);  
        task.call();  //���ô���  ,����class�ļ�
        sjf.close();  
          
        URL urls[] = new URL[]{ new URL("file:/D:/")}; //�����ļ�Ŀ¼�ĵ�ַ
        URLClassLoader uLoad = new URLClassLoader(urls);  //classloader���ĸ�Ŀ¼�ң� 
        //uLoad.loadClass("Hello");
        Class c = uLoad.loadClass("Hello");  //���ĸ�class�ļ� ע�ⲻ����׺��  
        //c.newInstance();  //����һ��ʵ��  
        
        Method method = c.getMethod("printString");
        String string = method.invoke(c.newInstance()).toString();
        System.out.println(string);
	}

}
