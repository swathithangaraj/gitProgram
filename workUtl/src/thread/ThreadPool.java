package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * �̳߳ز���
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
	 * �����̳߳�
	 */
	public void textExecutor(){
		Runnable r = new MultiThread();
		//ΪԤ��ִ�ж������ĵ��̡߳��ء���һ���̵߳�ȫ������ִ����֮��Ż�ִ�н��������߳�
		ExecutorService pool = Executors. newSingleThreadExecutor();
		//ΪԤ��ִ�ж������Ĺ̶��̳߳�,�ɲ���ִ�ж��̵߳�����
		ExecutorService numPool = Executors.newScheduledThreadPool(3);
		MyText m1 = new MyText("zhangchao");
		MyText m2 = new MyText("jimmy");
		MyText m3 = new MyText("porco");
		numPool.execute(m1);
		numPool.execute(m2);
		numPool.execute(m3);
		numPool.shutdown();//�رշ����������Щ�Ѿ��ύ�˵����񣬵��ǲ��ٽ���������
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
