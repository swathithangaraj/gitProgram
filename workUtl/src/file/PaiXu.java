package file;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.Util;




/**
 * ���������㷨,�������ԣ������㷨���ٶ�ֻȡ��������Ĺ�ģ������ȡ�����������Ĵ�С
 * ��ģ��ָ���鳤��
 * ������<15��ð�������ٶȸ���
 * ������>15:���ٸ��죬���ҵ���ģԽ��Խ���Ժ󣬿��Ż�
 * @author RonaldoGT
 *
 */
public class PaiXu {

	private static PaiXu paiXu = new PaiXu();
	private Util util = new Util();
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Կ�ʼʱ�䣬����ʱ��
		long startime;
		long endtime;
		List<Integer> arrayList = new ArrayList<Integer>();

		arrayList = paiXu.returnList(15000);//�����ģ
		int size = arrayList.size();
		int[] array = new int[size];

		//��ArrayListת��Ϊ  int  ����
		for(int i=0;i<array.length;i++){
			array[i]=arrayList.get(i); 
		}
		
		//����Ϊ�����㷨���ܲ��Դ���
		
		startime = System.nanoTime();
		paiXu.MaoPao(array,array.length);
		endtime = System.nanoTime();
		System.out.println("maopao=="+(endtime-startime));
		
		startime = System.nanoTime();
		paiXu.kuaiSu(array,0,size-1);
		endtime = System.nanoTime();
		System.out.println("kuaisu=="+(endtime-startime));
		
		
		
		
	
//		for(int i=0;i<array.length;i++){
//			System.out.print(","+array[i]);
//		}
	}
	
	/**
	 * ����һ��  ����Ϊsize��  �ڲ�ȫ�����int���͵�  ArrayList
	 * @param size
	 * @return
	 */
	public ArrayList returnList(int size){
		ArrayList array = new ArrayList();
		int i=0;
		while(i<size){
			int index = util.RandomNumber(0, 10000);//�������������Χ0-10000
			array.add(index);
			i++;
		}
		return array;
	}

	/**
	 * ��������
	 * @param array
	 * @param left    
	 * @param right
	 */
	public void kuaiSu(int[] array,int left,int right){
		if(left<right){//�ж���û�б���������
			int star = left;
			int end = right;
			int key = array[star];//�����ݴ�keyֵ������key�ֱ�Ƚ���������Ԫ��
			
			if((array == null)||(end == 0)){
				return;//�������Ϊnull�򷵻�
			}else{
				while(star<end){
					while(star<end&&array[end]>key){
						end--;
					}
					array[star]=array[end];
					while(star<end&&array[star]<=key){
						star++;
					}
					array[end]=array[star];
				}
				array[star]=key;
				kuaiSu(array,left,star-1);//���������ݹ飬����������
				kuaiSu(array,star+1,right);//���Ҳ�����ݹ飬����������
			}
		}
	}
	
	/**
	 * ð������
	 * @param array��Ҫ���������
	 * @param arrayLength�����鳤��
	 */
	public void MaoPao(int[] array,int arrayLength){		
		int temp;
		for(int i=0;i<arrayLength;i++){
			if(i+1<arrayLength&&array[i]>array[i+1]){
				temp =array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		arrayLength--;
		if(arrayLength>0){
			MaoPao(array,arrayLength);
		}
	}
	

}
