package datedemo;

import java.util.Date;

/**
 * java.util.Date
 * date:日期
 * 获取当前时间
 * @author Nick
 *
 */
public class DateTest {
	public static void main(String[] args) {
		/**
		 * 构造方法:
		 * 1.Date():创建出来的对象表示当前的时间
		 * 2.Date(long ms) -Date
		 * 3..GetTime()-Long:返回自1970年1.1 00:00的毫秒总数
		 */
		/*Date date = new Date();
		long tomorrow = date.getTime()+24*60*60*60*60*10;
	    Date todate = new Date(tomorrow);
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(todate);*/
		
		/**
		 * 第二种方法：获取当前时间
		 * 4.System.currentTImeMills()
		 */
		/*System.out.println(System.currentTimeMillis());*/
		
		/**
		 * setTime(long ms);
		 * 让date对象指向ms毫秒表示的具体时间
		 */
		Date date = new Date();
		long currentTime = date.getTime();
		long yester = currentTime-24*60*60*60*10;
		date.setTime(yester);
		System.out.println(date);
	}

}
