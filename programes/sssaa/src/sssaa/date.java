package sssaa;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) throws ParseException {
		String start_dt = "2011/01/01";
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-DD");
		Date date = (Date)formatter.parse(start_dt);
		SimpleDateFormat newFormat = new SimpleDateFormat("MM-dd-yyyy");
		String finalString = newFormat.format(date);
		System.out.println(finalString);
	}

}
