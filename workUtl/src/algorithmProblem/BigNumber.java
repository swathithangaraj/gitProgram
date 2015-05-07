package algorithmProblem;


/**
 * 大数处理
 * @author ronaldoGT
 *
 */
public class BigNumber {
	
	private static BigNumber bigNum = new BigNumber();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//加数
		String addend = "12345";
		//被加数
		String augend = "5432100";
		String str = bigNum.addNumber(addend,augend);
	}
	
	/**
	 * 大数相加
	 * @param s1
	 * @param s2
	 * @return
	 */
	public String addNumber(String s1,String s2){
		String min = s1.length() <= s2.length()?takeBack(s1):takeBack(s2);
		String max = s1.length() > s2.length()?takeBack(s1):takeBack(s2);
		int index = 0;
		StringBuffer result = new StringBuffer();
		for(int i = 0 ; i < max.length() ; i++){//使用最大位数来进行循环
			try{
				int mark = Integer.parseInt(min.charAt(i)+"")+Integer.parseInt(max.charAt(i)+"")+index;//标记是否发生进位
				if(mark>=10){
					index = 1;
					mark -= 10;
				}
				result.append(mark);
			}catch(Exception e){
				
			}
			
		}
		return takeBack(result.toString());
	}

	/**
	 * 反转字符串
	 * @param str
	 * @return
	 */
	public String takeBack(String str){
		StringBuffer result = new StringBuffer();
		for(int i = str.length()-1 ; i >= 0 ; i--){
			result.append(str.charAt(i));
		}
		System.out.println(result);
		return result.toString();
	}
}


