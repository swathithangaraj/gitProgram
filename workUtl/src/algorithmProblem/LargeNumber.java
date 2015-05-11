package algorithmProblem;


/**
 * 大数处理
 * @author ronaldoGT
 *
 */
public class LargeNumber {
	
	private static LargeNumber bigNum = new LargeNumber();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//加数
		String addend = "199124184714717423989946727492472947629947662499747018091044924934153412170489450300035477372628428192873462348345625351232173";
		//被加数
		String augend = "987665553729018375950271635482903746589103989273294612201023454891018289199281922526981919773767374921010481924242565768827228398341849184889299292";
		String str = bigNum.largeNumber(addend, augend);
		System.out.println("str:"+bigNum.takeBack(str));
	}
	
	/**
	 * 大数相加
	 * 将超大数用字符串，然后反转操作字符串
	 * @param s1
	 * @param s2
	 * @return
	 */
	public String largeNumber(String s1,String s2){
		String min = s1.length() <= s2.length() ? s1:s2;
		String max = s1.length() > s2.length() ? s1:s2;
		int minSize = min.length();
		int maxSize = max.length();
		int index = 0;//标记是否发生进位
		StringBuffer result = new StringBuffer();
		for(int i = min.length()-1 ; i >= 0 ; i--) {//使用最小位数来进行循环,反向
			int mark = Integer.parseInt(min.charAt(i) + "") + Integer.parseInt(max.charAt(i+(maxSize-minSize)) + "") + index;
			if (mark >= 10) {
				index = 1;
				mark -= 10;
			}else{
				index = 0;
			}
			result.append(mark);
		}
		//当且仅当max,min位数一样时,并且发生进位
		if(max.length()<=min.length()){
			if(index>0) {
				result.append(index);
			}
		}else{
			String highPosition = max.substring(0,maxSize-minSize);//截取max超出min的部分
			if(highPosition.length()>9){//Integer是32位，范围-2147483648 到2147483648
				//此处开始递归，确保每次送入的数都是正序排列的
				result.append(largeNumber(highPosition, index + ""));
			}else{
				result.append(takeBack(Integer.parseInt(highPosition)+index+""));
			}
		}
		return result.toString();
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
		return result.toString();
	}
}


