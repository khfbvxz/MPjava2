package modulepackge;


import java.util.Calendar;

public class CalenderEx {
	public static void printCalendar(String msg, Calendar cal){
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int milsec = cal.get(Calendar.MILLISECOND);
		System.out.print(msg+year+"/"+month+"/"+day+"/");
		
	
		
	}
	public static void main(String[] args) {
//		Calendar now = new Calendar.Instance();
//		printCalendar("현재", now);
//		System.out.println(now);
		
	}
}
