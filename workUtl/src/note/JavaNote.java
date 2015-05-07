package note;

import java.lang.annotation.ElementType; 
import java.lang.annotation.Retention; 
import java.lang.annotation.Target;  
import java.lang.annotation.RetentionPolicy; 
/**
 * Javaע�������
 * @param args
 * 
 * ...........................................................................
 * Java���ṩ������Ԫע�⣬ר�Ÿ���ע��������ע�⣬�ֱ�����
 * 
 * 1.@RetentionԪע�⣬��ʾ��Ҫ��ʲô���𱣴��ע����Ϣ���������ڣ�����ѡ��RetentionPoicy����������
 * RetentionPolicy.?��
 * SOURCE��ע����Ϣ��������Ŀ��������Դ���ļ��У�����Ӧ���ֽ����ļ������ٱ�����
 * CLASS��ע����Ϣ������Ŀ���������ֽ����ļ��У���������������ֽ����ļ�ʱ���Ὣע����ص�JVM�У�
 * 		     Ҳ�������ڲ��ܻ�ȡע����Ϣ��
 * RUNTIME��ע����Ϣ��Ŀ������ص�JVM����Ȼ�������������ڿ���ͨ��������ƶ�ȡ����ע����Ϣ��
 * 
 * 2.@TargetԪע�⣬Ĭ��ֵΪ�κ�Ԫ�أ���ʾ��ע������ʲô�ط������õ�ElementType��������
 * ElementType.?:
 * TYPE���ࡢ�ӿڡ�ע���ࡢEnum����������Ӧ��ע���Ϊ����ע�⣻
 * FIELD�����Ա������������������Ӧ��ע���Ϊ��ֵע�⣻
 * METHOD����������������Ӧ��ע���Ϊ����ע�⣻
 * PARAMETER����������������Ӧ��ע���Ϊ����ע�⣻
 * CONSTRUCTOR�����캯������������Ӧ��ע���Ϊ���캯��ע�⣻
 * LOCAL_VARIABLE���ֲ���������������Ӧ��ע���Ϊ�������ע�⣻
 * 
 * 3.@Documented��ע�������JavaDoc��
 * 
 * 4.@Inheried��������̳и����е�ע��
 */
@Retention(RetentionPolicy.RUNTIME)//������ע��ı�������
@Target(ElementType.METHOD)//����������ʹ�ø�ע���Ŀ������ ,1,2����Ԫע��
public @interface JavaNote{//@interface����ע����
	
	String getName() default "zhangChao";//������Ա��ӿ����ƣ�[Ĭ��ֵ],��Ա����������׳��쳣�ķ�ʽ����
	
	int getDay();
	
	int[] number();
}
