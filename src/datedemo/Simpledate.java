package datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换类：在指定格式的字符的日期表示和日期对象之间进行转换
 * SimpleDateFormat一旦创建，此对象能做指定格式的字符串类型和Date类型转换，但是格式不能变
 * 否则不能识别
 * @author Nick
 *
 */
public class Simpledate {
	public static void main(String[] args) throws ParseException {
		/**
		 * SimpleDateFormat构造方法
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//new SimpleDateFormat("格式");
		/**
		 * 两种方法
		 * 1.format(Date) -String Date转换为String
		 * 2.parse(String) -Date String转换为Date
		 */
		Date now = new Date();
		long nowMs = now.getTime();
		String source = "1995-11-26 10:10:10";
		Date birth = sdf.parse(source);//parse()方法
		long birthMs = birth.getTime();
		long minus = nowMs-birthMs;
		long days = minus/1000/60/60/24;
		System.out.println("恭喜你活力"+days+"天");
		
		SimpleDateFormat sdfs = new SimpleDateFormat("yy/MM/dd hh:mm:ss");
		String nows = sdfs.format(now);
		System.out.println(nows);
		Date bitrhdays = sdfs.parse("1995/11/26 10:10:10");
		System.out.println(bitrhdays);//String 中指定的格式不能变，变化的话不会识别出来
	}

}
