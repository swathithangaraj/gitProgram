package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SystemTime {

	/**
	 * 该类提供有关系统时间的一系列方法
	 */
	//返回Calendar对象，
	public Calendar getTimeField(){
		Calendar cal=Calendar.getInstance();
		// int day = cal.get(Calendar.DATE);//当前时间在月中的天数
		 // int month = cal.get(Calendar.MONTH) + 1;//月份从0开始
		 // int year = cal.get(Calendar.YEAR);
		 // int dayweek = cal.get(Calendar.DAY_OF_WEEK);//周日开始，周六是最后一天
		 // int daymonth = cal.get(Calendar.DAY_OF_MONTH);
		 // int dayyear = cal.get(Calendar.DAY_OF_YEAR);
		 // int hour = cal.get(Calendar.HOUR_OF_DAY);
		 // System.currentTimeMillis();//当前的时间的long型的时间的毫秒值，这个值实际上是当前时间值与1970年一月一号零时零分零秒相差的毫秒数。
		 return cal;
	}
	
	//设置系统时间，并返回设定时间后的系统时间对象
	public Date setSystemTime(String newDate){
		Date date=new Date();
 		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日_HH时mm分ss秒",Locale.SIMPLIFIED_CHINESE);//标识本地语言
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日_HH时mm分");//标识本地语言
		
		try {
			date = sdf.parse(newDate);//例如：newDate="2006年07月01日_14时00分00秒"
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	//根据参数格式获取系统时间,例如:
	public void getSystemTime(String formatday){//"yyyy年——MM月——dd日    【HH:mm:ss】"
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat(formatday);//日历格式化
		String time=sdf.format(date);
	}
	
	
	public static void main(String[] args) {
		SystemTime sy=new SystemTime();
		Date date = sy.setSystemTime("2006年07月01日_14时00分");
		System.out.println(new java.sql.Timestamp(date.getTime()));
		System.out.println(date);
		
	}
}
