package datedemo;

import java.util.Date;

/**
 * java.util.Date
 * date:����
 * ��ȡ��ǰʱ��
 * @author Nick
 *
 */
public class DateTest {
	public static void main(String[] args) {
		/**
		 * ���췽��:
		 * 1.Date():���������Ķ����ʾ��ǰ��ʱ��
		 * 2.Date(long ms) -Date
		 * 3..GetTime()-Long:������1970��1.1 00:00�ĺ�������
		 */
		/*Date date = new Date();
		long tomorrow = date.getTime()+24*60*60*60*60*10;
	    Date todate = new Date(tomorrow);
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(todate);*/
		
		/**
		 * �ڶ��ַ�������ȡ��ǰʱ��
		 * 4.System.currentTImeMills()
		 */
		/*System.out.println(System.currentTimeMillis());*/
		
		/**
		 * setTime(long ms);
		 * ��date����ָ��ms�����ʾ�ľ���ʱ��
		 */
		Date date = new Date();
		long currentTime = date.getTime();
		long yester = currentTime-24*60*60*60*10;
		date.setTime(yester);
		System.out.println(date);
	}

}
