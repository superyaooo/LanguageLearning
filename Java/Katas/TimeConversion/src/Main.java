import java.util.Scanner;

/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour
 * clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 *
 * Input Format:
 * A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM or
 * hh:mm:ssPM), where 01<=hh<=12 and 00<=mm, ss<=59.
 *
 * Output Format:
 * Convert and print the given time in 24-hour format, where 00<=hh<=23.
 *
 * Sample Input:
 * 07:05:45PM
 *
 * Sample Output:
 * 19:05:45
 *
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        int hour = Integer.parseInt(time.substring(0, 2));
        String result = "";
        String indicator = time.substring(8);
        if(indicator.equals("AM")){
            if(hour == 12)
                result = "00" + time.substring(2, 8);
            else{
                result = time.substring(0,8);
            }
        }
        else if(indicator.equals("PM")){
            if(hour == 12)
                result = time.substring(0,8);
            else{
                int newHour = hour + 12;
                result = newHour + time.substring(2,8);
            }
        }

        System.out.print(result);
    }
}
