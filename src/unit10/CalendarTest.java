/*
Author: QAlexBall
Date: 2017/9/17
Content: how to use class named Calendar.
 */

package unit10;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String [] args) {
        Calendar c = Calendar.getInstance();
        c.set(2017,9,17,20,53);

        long day1 = c.getTimeInMillis();
        day1 += 1000 *  60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("new hour" + c.get(c.HOUR_OF_DAY));

        c.add(c.DATE, 35);
        System.out.println("add 35 day" + c.getTime());

        c.roll(c.DATE, 35);
        System.out.println("roll 35 day" + c.getTime());

        c.set(c.DATE, 1);
        System.out.println("set to 1" + c.getTime());
    }
}
