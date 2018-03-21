git@github.com:QAlexBall/CALENDAR.git/**
 * @Author QAlexBall
 * @Content: CalendarMain.java
 */

public class CalendarMain {
	public static void main(String[] args) {

		// setting calendar's attribution
		CalendarFrame frame = new CalendarFrame();
		frame.setBounds(150, 150, 600, 350);
		frame.setVisible(true);
		frame.setYearAndMonth(2017, 11);
		frame.setTitle("Calendar");
	}
}



