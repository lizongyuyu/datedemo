package datedemo;

import java.util.Calendar;
import java.util.Date;

public class Calendardemo {
	public static void main(String[] args) {
		/**
		 * ��������
		 * 1.�����������GregorianCalender
		 * 2.���þ�̬������getinstance();
		 */
		Calendar ca = Calendar.getInstance();
		
		/***
		 * 3.get����
		 * get(int filed)
		  * ��ȡ��ǰʱ����꣬�£��գ����ڼ�
		 */
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH);//�·��Ǵ�0��ʼ�ģ���Ҫ+1
		int weak = ca.get(Calendar.DAY_OF_WEEK);//1����������
		System.out.println(year+" "+month+" "+weak);
		/**
		  *  gettime()���õ�ָ�����ڵ�date���ͱ�ʾ
		  * ������Date��gettime()����
		  */
		Date date = ca.getTime();
		System.out.println(date);
		/**
		 * getTimeInMills():
		 * ��Date���е�getTime()������ͬ
		 */
		long ms = ca.getTimeInMillis();
		System.out.println(ms);
		
		/**
		 * 4.set����
		 * set(int Filed,int value):��ָ�������ֶθ�ֵ
		 * ͨ��������Calendar����ָ�������ʱ��
		 * 
		 * set�󲢲����������������м��㣬ֻ�е���get()һϵ�еķ������ܸ�calendar�е�ֵ�ı�
		 * ֱ�Ӷ��ܼ����в����Ļ�ֻ���ǵ�ǰ��ʱ�����ڣ�ֻ�е���һ��get������
		 * ���ܽ����������ã��ײ�Ҫ�����
		 */
		/*Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH,11);
		cal.set(Calendar.YEAR,2000);
		date = cal.getTime();
		System.out.println(date);*/
		
		/**
		 * setTime(Date date);
		 * ��calendar����ָ��Date�����ʱ��
		 */
		/*cal.setTime(date);
		System.out.println(cal.getTimeInMillis());*/
		
		/**
		 * 5.add(int field,int amount)
		 * amount�����ɸ�
		 */
		Calendar cal = Calendar.getInstance();
		//��calendar����ָ��ɽ���µĽ���
		/*cal.add(Calendar.MONTH,-1);
		int month2 = cal.get(Calendar.MONTH)+1;
		System.out.println(month2);*/
		
		/**
		 * getActualMaximum(int field)
		 * ��ȡָ�������ֶε����ֵ
		 */
		cal.set(Calendar.MONTH, 1);
		int maxDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(maxDate);
	}

}
