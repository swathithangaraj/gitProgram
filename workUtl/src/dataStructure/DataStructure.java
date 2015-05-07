package dataStructure;

import java.util.ArrayList;
import java.util.List;

import entity.Subject;

/**
 * 模拟数据结构
 * @author ronaldoGT
 *
 */
public class DataStructure {

	private static DataStructure dataStructure = new DataStructure(); 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataStructure.addData();
	}
	
	/**
	 * 树结构
	 */
	public void tree(){
		List<Subject> list = addData();
		
 	}
	
	public List<Subject> addData(){
		List<Subject> list = new ArrayList();

		return list;
	}

}
