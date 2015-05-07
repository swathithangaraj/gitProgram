package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SystemTime {

	/**
	 * �����ṩ�й�ϵͳʱ���һϵ�з���
	 */
	//����Calendar����
	public Calendar getTimeField(){
		Calendar cal=Calendar.getInstance();
		 // int day = cal.get(Calendar.DATE);//��ǰʱ�������е�����
		 // int month = cal.get(Calendar.MONTH) + 1;//�·ݴ�0��ʼ
		 // int year = cal.get(Calendar.YEAR);
		 // int dayweek = cal.get(Calendar.DAY_OF_WEEK);//���տ�ʼ�����������һ��
		 // int daymonth = cal.get(Calendar.DAY_OF_MONTH);
		 // int dayyear = cal.get(Calendar.DAY_OF_YEAR);
		 // int hour = cal.get(Calendar.HOUR_OF_DAY);
		 // System.currentTimeMillis();//��ǰ��ʱ���long�͵�ʱ��ĺ���ֵ�����ֵʵ�����ǵ�ǰʱ��ֵ��1970��һ��һ����ʱ����������ĺ�������
		 return cal;
	}
	
	//����ϵͳʱ�䣬�������趨ʱ����ϵͳʱ�����
	public Date setSystemTime(String newDate){
		Date date=new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��_HHʱmm��ss��",Locale.SIMPLIFIED_CHINESE);//��ʶ��������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��_HHʱmm��");//��ʶ��������
		
		try {
			date = sdf.parse(newDate);//���磺newDate="2006��07��01��_14ʱ00��00��"
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	//���ݲ�����ʽ��ȡϵͳʱ��,����:
	public void getSystemTime(String formatday){//"yyyy�ꡪ��MM�¡���dd��    ��HH:mm:ss��"
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat(formatday);//������ʽ��
		String time=sdf.format(date);
	}
	
	
	public static void main(String[] args) {
		SystemTime sy=new SystemTime();
		Date date = sy.setSystemTime("2006��07��01��_14ʱ00��");
		System.out.println(new java.sql.Timestamp(date.getTime()));
		System.out.println(date);
		
	}
}
