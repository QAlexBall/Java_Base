/**
 * @Content: CalendarFunc.java
 */
import java.util.*;
public class CalendarFunc {
	String day[];
	int year = 2005, month = 0;

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public String[] getCalendar() {
		String a[] = new String[42];
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);
		int Week = calendar.get(Calendar.DAY_OF_WEEK) - 1;

		// Determine the number of days in the month
		int day = 0;
		int MonthDay31[] = {1, 3, 5, 7, 8, 10, 12};
		int MonthDay30[] = {4, 6, 9, 11};
		for(int MONTH1 : MonthDay31) {
			if(month == MONTH1) {
				day = 31;
				break;
			}
		}
		for(int MONTH2 : MonthDay30) {
			if(month == MONTH2) {
				day = 30;
				break;
			}
		}
		if(month == 2) {
			if(((year %4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				day = 29;
			else
				day = 28;
		}
		for(int i = Week, n = 1; i < Week + day; i++) {
			a[i] = String.valueOf(n);
			n++;
		}
		return a;
	}
}