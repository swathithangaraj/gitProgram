package note;

import java.lang.annotation.ElementType; 
import java.lang.annotation.Retention; 
import java.lang.annotation.Target;  
import java.lang.annotation.RetentionPolicy; 
/**
 * Java注解测试类
 * @param args
 * 
 * ...........................................................................
 * Java中提供了四种元注解，专门负责注解其他的注解，分别如下
 * 
 * 1.@Retention元注解，表示需要在什么级别保存该注释信息（生命周期）。可选的RetentionPoicy参数包括：
 * RetentionPolicy.?：
 * SOURCE：注解信息仅保留在目标类代码的源码文件中，但对应的字节码文件将不再保留；
 * CLASS：注解信息将进入目标类代码的字节码文件中，但类加载器加载字节码文件时不会将注解加载到JVM中，
 * 		     也即运行期不能获取注解信息；
 * RUNTIME：注解信息在目标类加载到JVM后依然保留，在运行期可以通过反射机制读取类中注解信息。
 * 
 * 2.@Target元注解，默认值为任何元素，表示该注解用于什么地方。可用的ElementType参数包括
 * ElementType.?:
 * TYPE：类、接口、注解类、Enum声明处，相应的注解称为类型注解；
 * FIELD：类成员变量或常量声明处，相应的注解称为域值注解；
 * METHOD：方法声明处，相应的注解称为方法注解；
 * PARAMETER：参数声明处，相应的注解称为参数注解；
 * CONSTRUCTOR：构造函数声明处，相应的注解称为构造函数注解；
 * LOCAL_VARIABLE：局部变量声明处，相应的注解称为局域变量注解；
 * 
 * 3.@Documented将注解包含在JavaDoc中
 * 
 * 4.@Inheried允许子类继承父类中的注解
 */
@Retention(RetentionPolicy.RUNTIME)//①声明注解的保留期限
@Target(ElementType.METHOD)//②声明可以使用该注解的目标类型 ,1,2都是元注解
public @interface JavaNote{//@interface定义注解类
	
	String getName() default "zhangChao";//声明成员与接口类似，[默认值],成员以无入参无抛出异常的方式声明
	
	int getDay();
	
	int[] number();
}
