package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * �ṩjava   IO  ����
 * @author ronaldoGT
 *
 */
public class IOfile {

	/**
	 * @param args
	 */
	private static IOfile ioFile = new IOfile();
	private static String oldUrl = "E://FunshionMedia/�ڿ͵۹�/����������-20130311.mp4";
	private static String newUrl = "E://����������-20130311.mp4";
	
	public static void main(String[] args) {
		long star = System.nanoTime();
		//ioFile.copyFile(new File(oldUrl),new File(newUrl));//601508919
		//ioFile.copyDirectory(new File("D:/html5"),"E:/");
		//ioFile.textFileChannel(new File(oldUrl),new File(newUrl));//1511679222
		ioFile.textFileChannelReadWrite(new File(oldUrl),new File(newUrl));//1333882326
		long end = System.nanoTime();
		System.out.println(end-star);
	}
	
	/**
	 * �ļ�ͨ�� ����
	 * @param oldFile
	 * @param newFile
	 */
	public void textFileChannel(File oldFile,File newFile){
		FileChannel fis = null ;
		FileChannel fos = null ; 
		try {
			fis = new FileInputStream(oldFile).getChannel();
			fos = new FileOutputStream(newFile).getChannel();
			fis.transferTo(0, fis.size(), fos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * �����ļ�ͨ��   read��write����
	 * @param oldFile
	 * @param newFile
	 */
	public void textFileChannelReadWrite(File oldFile,File newFile){
		FileChannel fis = null ;
		FileChannel fos = null ; 
		try {
			fis = new FileInputStream(oldFile).getChannel();
			fos = new FileOutputStream(newFile).getChannel();
			ByteBuffer buf = ByteBuffer.allocate(1024*2);
			while(fis.read(buf) != -1){
				buf.flip();//׼��д�룬��ֹ������ȡ����ס�ļ�  
	            fos.write(buf);  
	            buf.clear();//׼����ȡ����������������ϣ��ƶ��ļ��ڲ�ָ��  
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * �����ļ��У�Ƕ���ļ��У��Լ��������ļ�
	 * @param oldDirectory
	 * @param newUrl
	 */
	public void copyDirectory(File oldDirectory,String newUrl){
		File[] f=oldDirectory.listFiles();
		File file = new File(newUrl);
		String url;
		url = oldDirectory.getName();
		newUrl += "/"+url;
		file = new File(newUrl);
		file.mkdir();
		for(File ff:f){
			if(ff.isDirectory()){ 
				copyDirectory(ff,newUrl);
			}
			if(ff.isFile()){
				copyFile(ff,new File(newUrl+"/"+ff.getName()));
			}	
		}
	
	}
	
	
	/**
	 * �����ļ�
	 * @param oldFile
	 * @param newFile
	 */
	public void copyFile(File oldFile,File newFile){
		InputStream fis = null;
		OutputStream fos = null;
		try {
			fis = new BufferedInputStream(new FileInputStream(oldFile));
			fos = new BufferedOutputStream(new FileOutputStream(newFile));
			byte[] buf = new byte[1024*2];
			int len ;
			while((len = fis.read(buf)) != -1){
				fos.write(buf, 0, len);
			}
			fos.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}



