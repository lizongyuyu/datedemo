package datedemo;

import java.util.Calendar;
import java.util.Date;

public class Calendardemo {
	public static void main(String[] args) {
		/**
		 * 创建对象
		 * 1.创建子类对象：GregorianCalender
		 * 2.调用静态方法：getinstance();
		 */
		Calendar ca = Calendar.getInstance();
		
		/***
		 * 3.get方法
		 * get(int filed)
		  * 获取当前时间的年，月，日，星期几
		 */
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH);//月份是从0开始的，需要+1
		int weak = ca.get(Calendar.DAY_OF_WEEK);//1代表星期日
		System.out.println(year+" "+month+" "+weak);
		/**
		  *  gettime()：得到指定日期的date类型表示
		  * 区别于Date的gettime()方法
		  */
		Date date = ca.getTime();
		System.out.println(date);
		/**
		 * getTimeInMills():
		 * 和Date类中的getTime()方法相同
		 */
		long ms = ca.getTimeInMillis();
		System.out.println(ms);
		
		/**
		 * 4.set方法
		 * set(int Filed,int value):给指定日历字段赋值
		 * 通常用于让Calendar对象指向给定的时间
		 * 
		 * set后并不是立即对日历进行计算，只有调用get()一系列的方法才能给calendar中的值改变
		 * 直接对周几进行操作的话只能是当前的时间日期，只有调用一次get方法后
		 * 才能进行重新设置，底层要求如此
		 */
		/*Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH,11);
		cal.set(Calendar.YEAR,2000);
		date = cal.getTime();
		System.out.println(date);*/
		
		/**
		 * setTime(Date date);
		 * 让calendar对象指向Date对象的时间
		 */
		/*cal.setTime(date);
		System.out.println(cal.getTimeInMillis());*/
		
		/**
		 * 5.add(int field,int amount)
		 * amount可正可负
		 */
		Calendar cal = Calendar.getInstance();
		//让calendar对象指向山个月的今天
		/*cal.add(Calendar.MONTH,-1);
		int month2 = cal.get(Calendar.MONTH)+1;
		System.out.println(month2);*/
		
		/**
		 * getActualMaximum(int field)
		 * 获取指定日历字段的最大值
		 */
		cal.set(Calendar.MONTH, 1);
		int maxDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(maxDate);
	}

}
