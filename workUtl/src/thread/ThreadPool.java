package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 线程池测试
 * @author ronaldoGT
 *
 */
public class ThreadPool {
	
	private static ThreadPool tp = new ThreadPool(); 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tp.textExecutor();
	}
	
	/**
	 * 测试线程池
	 */
	public void textExecutor(){
		Runnable r = new MultiThread();
		//为预定执行而构建的单线程“池”，一个线程的全部任务执行完之后才会执行接下来的线程
		ExecutorService pool = Executors. newSingleThreadExecutor();
		//为预定执行而构建的固定线程池,可并发执行多线程的任务
		ExecutorService numPool = Executors.newScheduledThreadPool(3);
		MyText m1 = new MyText("zhangchao");
		MyText m2 = new MyText("jimmy");
		MyText m3 = new MyText("porco");
		numPool.execute(m1);
		numPool.execute(m2);
		numPool.execute(m3);
		numPool.shutdown();//关闭服务，先完成那些已经提交了的任务，但是不再接受新任务
	}
}

class MyText implements Runnable{
	private String name ;
	
	public MyText(String name){
		this.name=name;
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(100);
				System.out.println("MyText"+i+":"+name);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}	
		}
	}
}
