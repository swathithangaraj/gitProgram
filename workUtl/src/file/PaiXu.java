package file;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.Util;




/**
 * 关于排序算法,经过测试，排序算法的速度只取决于排序的规模，而不取决于排序数的大小
 * 规模泛指数组长度
 * 当长度<15：冒泡排序速度更快
 * 当长度>15:快速更快，并且当规模越来越大以后，快排会
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
		//测试开始时间，结束时间
		long startime;
		long endtime;
		List<Integer> arrayList = new ArrayList<Integer>();

		arrayList = paiXu.returnList(15000);//数组规模
		int size = arrayList.size();
		int[] array = new int[size];

		//将ArrayList转换为  int  数组
		for(int i=0;i<array.length;i++){
			array[i]=arrayList.get(i); 
		}
		
		//下面为排序算法性能测试代码
		
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
	 * 返回一个  长度为size的  内部全是随机int类型的  ArrayList
	 * @param size
	 * @return
	 */
	public ArrayList returnList(int size){
		ArrayList array = new ArrayList();
		int i=0;
		while(i<size){
			int index = util.RandomNumber(0, 10000);//返回随机数，范围0-10000
			array.add(index);
			i++;
		}
		return array;
	}

	/**
	 * 快速排序
	 * @param array
	 * @param left    
	 * @param right
	 */
	public void kuaiSu(int[] array,int left,int right){
		if(left<right){//判断有没有遍历完数组
			int star = left;
			int end = right;
			int key = array[star];//定义暂存key值，并用key分别比较数组左右元素
			
			if((array == null)||(end == 0)){
				return;//如果数组为null则返回
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
				kuaiSu(array,left,star-1);//将左侧数组递归，并重新排序
				kuaiSu(array,star+1,right);//将右侧数组递归，并重新排序
			}
		}
	}
	
	/**
	 * 冒泡排序
	 * @param array：要排序的数组
	 * @param arrayLength：数组长度
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
