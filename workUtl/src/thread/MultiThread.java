package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * java ���߳�
 * @author ronaldoGT
 *
 */
public class MultiThread implements Runnable{

	private static MultiThread multiThread = new MultiThread();
	private int index = 1000;
	private Lock lock = new ReentrantLock();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiThread.textTongBu();
	}

	
	/**
	 * ͬ������
	 */
	public void textTongBu(){
		Runnable r = new MultiThread();		
		for(int i = 0;i < 10 ; i++){
			Thread thread = new Thread(r);
			Thread thread2 = new Thread(r);
			Thread thread3 = new Thread(r);
			thread.start();
			thread2.start();
			thread3.start();
		}
	}
	
	public void textThreadGroup(){
		Runnable r = new MultiThread();
		ThreadGroup tg = new ThreadGroup("textGroup");
		Thread t1 = new Thread(tg,r,"t1");
		Thread t2 = new Thread(tg,r,"t2");
		Thread t3 = new Thread(tg,r,"t3");
		System.out.println(Thread.currentThread());
		t1.start();
		tg.interrupt();//�ж��߳����е������߳�
		if(tg.activeCount()==0){//�����߳����п����е��߳���
			System.out.println("all threads in the group tg have stopped");
		}
	}
	
	public void textRunnable(){
		Runnable r = new MultiThread();
		for(int i = 0;i < 10 ; i++){
			Thread thread = new Thread(r);
			Thread thread2 = new Thread(r);
			Thread thread3 = new Thread(r);
			thread.setDaemon(true);//�����ػ��߳�
			thread.start();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			thread2.start();
			thread3.start();
		}
	}
	
	
	/*--------------------------------------����Ϊ����ʱ���Է���---------------------------------------*/
	
	public void run(){
		//textReentrantLock();
		//textCondition();
		textSynchronized();
	}
	
	
	public synchronized void textSynchronized(){	
		try {
			while(index==1000){
				System.out.println("no:"+index);
				wait();//  == await();
			}
			notifyAll(); //  == signalAll();
			System.out.println("1000index:"+index);
			index-=100;	
			Thread.sleep(100);
			index+=100;	
			System.out.println(index);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void textCondition(){
		Condition con = lock.newCondition();
		lock.lock();
		index-=100;		
		try {
			while(index==1000){
				System.out.println("no:"+index);
				con.await();	//�Ѹ��̷߳ŵ������ĵȴ�����ȥ	
				//Thread.sleep(10);	
			}
			con.signalAll();//����������ȴ����������̵߳�����״̬
			index+=100;
			System.out.println("1000index:"+index);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}finally{
			lock.unlock();
		}	
	}
	
	public void textReentrantLock(){
		lock.lock();//����
		try {
			index-=100;
			Thread.sleep(100);
			index+=100;
			System.out.println(index);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}finally{
			lock.unlock();//����
		}
	}
}
