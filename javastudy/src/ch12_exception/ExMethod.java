package ch12_exception;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * class Name: ExMethod
 * Author    : 202-1
 * Created Date: 2024. 8. 20.
 * Version : 1,0
 * Purpose :exception
 * Description: 에외처리와 예외처리 안한 메소드의 차이
 */

public class ExMethod {

	   public static long dateMillsec1(String date) throws ParseException {
		   SimpleDateFormat sdf = new  SimpleDateFormat("yyyy.MM.dd");
		   Date temp = (Date) sdf.parse(date);
		   return temp.getTime();
	   }
	   public static long dateMillsec2(String date)  {
		   SimpleDateFormat sdf = new  SimpleDateFormat("yyyy.MM.dd");
		   Date temp;
		   Long result =0l;
		   try {
			   temp = (Date) sdf.parse(date);
			   result = temp.getTime();
			   } catch (ParseException e) {
				   e.printStackTrace();
			   }
		   return result;
	   }
}
