package datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ת���ࣺ��ָ����ʽ���ַ������ڱ�ʾ�����ڶ���֮�����ת��
 * SimpleDateFormatһ���������˶�������ָ����ʽ���ַ������ͺ�Date����ת�������Ǹ�ʽ���ܱ�
 * ������ʶ��
 * @author Nick
 *
 */
public class Simpledate {
	public static void main(String[] args) throws ParseException {
		/**
		 * SimpleDateFormat���췽��
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//new SimpleDateFormat("��ʽ");
		/**
		 * ���ַ���
		 * 1.format(Date) -String Dateת��ΪString
		 * 2.parse(String) -Date Stringת��ΪDate
		 */
		Date now = new Date();
		long nowMs = now.getTime();
		String source = "1995-11-26 10:10:10";
		Date birth = sdf.parse(source);//parse()����
		long birthMs = birth.getTime();
		long minus = nowMs-birthMs;
		long days = minus/1000/60/60/24;
		System.out.println("��ϲ�����"+days+"��");
		
		SimpleDateFormat sdfs = new SimpleDateFormat("yy/MM/dd hh:mm:ss");
		String nows = sdfs.format(now);
		System.out.println(nows);
		Date bitrhdays = sdfs.parse("1995/11/26 10:10:10");
		System.out.println(bitrhdays);//String ��ָ���ĸ�ʽ���ܱ䣬�仯�Ļ�����ʶ�����
	}

}
