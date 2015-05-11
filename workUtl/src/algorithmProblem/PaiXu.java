package algorithmProblem;

import java.util.ArrayList;
import java.util.List;

import util.Util;


/**
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
		long startime;
		long endtime;
		List<Integer> arrayList = new ArrayList<Integer>();

		arrayList = paiXu.returnList(15000);
		int size = arrayList.size();
		int[] array = new int[size];

		for(int i=0;i<array.length;i++){
			array[i]=arrayList.get(i); 
		}
		
		
//		startime = System.nanoTime();
//		paiXu.MaoPao(array,array.length);
//		endtime = System.nanoTime();
//		System.out.println("maopao=="+(endtime-startime));
//		
//		startime = System.nanoTime();
//		paiXu.kuaiSu(array,0,size-1);
//		endtime = System.nanoTime();
//		System.out.println("kuaisu=="+(endtime-startime));
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
	 * 快排
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
