package seleniumclasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		/*
		 * System.out.println(date);
		 * 
		 * System.out.println(date.getDate()); System.out.println(date.getDay());
		 * System.out.println(date.getMonth()); //date.setMonth(10);
		 * System.out.println(date.getMonth());
		 */
		
		//ddmmYYYY
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		String convertedDate = sdf.format(new Date());
		
		System.out.println(convertedDate);
		
	}

}
