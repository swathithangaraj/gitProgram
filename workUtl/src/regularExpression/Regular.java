package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 * @author ronaldoGT
 *
 */
public class Regular {

	private static Regular regular = new Regular();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		regular.text();
	}
	
	public void text(){
		String str = "<p>这是一段测试数据123text</p>"+
						"<img>2341444234</img>"+
						"<span>232141<p>hha</p>ee</span>";
		String number = "\\d+";
		String html = "<([^>]*)>";
		Pattern p = Pattern.compile(html);
		Matcher m = p.matcher(str);
		String ss = "";
		String[] name = p.split(str);
		for(String s:name){
			ss+=s;		
		}
		System.out.println(ss);
	}

}








