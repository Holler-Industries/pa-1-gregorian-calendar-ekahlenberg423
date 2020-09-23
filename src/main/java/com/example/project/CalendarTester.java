package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.
        //Current Date
        System.out.println("The current date is: " + myCal.get(Calendar.MONTH) + " / " + myCal.get(Calendar.DATE)+" / "+ myCal.get(Calendar.YEAR));
        //Month
        System.out.println("The Month is: " + myCal.get(Calendar.MONTH));
        //Year
        System.out.println("The Year is: " + myCal.get(Calendar.YEAR));
        //Day
        System.out.println("The Day is: " + myCal.get(Calendar.DAY_OF_YEAR));


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html
        myCal.add(Calendar.DAY_OF_YEAR,100);
        System.out.println("The new date is: " + myCal.get(Calendar.DATE));
        System.out.println("The day of the week is: " + myCal.get(Calendar.DAY_OF_WEEK));
        //Birthday
        myCal.add(Calendar.DAY_OF_YEAR,-100);
        myCal.setWeekDate(2021,19,4);
        System.out.println("The weekday of my birthday is: " + myCal.get(Calendar.DAY_OF_WEEK));
        //10,000 days from birthday
        myCal.add(Calendar.DAY_OF_YEAR,10000);
        System.out.println("10,000 days from by birthday the date will be: " + myCal.get(Calendar.MONTH) + " / " + myCal.get(Calendar.DATE)+" / "+ myCal.get(Calendar.YEAR));



        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)


    }

}