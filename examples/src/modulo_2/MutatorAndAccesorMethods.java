package modulo_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MutatorAndAccesorMethods {

    static LocalDate newYearsEve = LocalDate.of(2026, 10, 31);

    static void main() {
        LocalDate athousandDaysLater = newYearsEve.plusDays(1000);
        // This yields a new LocalDate object which is then assigned to the aThousandDaysLater variable.
        // The original object remains unchanged. We say that the plusDays method doest not mutate the object on which it is invoked.
        // Similar toUpperCase method of the String class.
        // When you call toUpperCase on a string, that string stays the same, and a new string with uppercase characters is returned.

        // An earlier version of the Java library had a different class for dealing with calendars, called GregorianCalendar.
        // Here is how you add a thousand days to a date represented by that class.

        GregorianCalendar someDay = new GregorianCalendar(2026, 11, 31);
        // odd feature of that class: month numbers go from 0 to 11
        someDay.add(Calendar.DAY_OF_MONTH, 1000);
        int year = someDay.get(Calendar.YEAR);
        int month = someDay.get(Calendar.MONTH);
        int day = someDay.get(Calendar.DAY_OF_MONTH);
        // After call the mutator method it no longer is new years eve after calling the mutator method.

        // Mutator / Accessor

        LocalDate date = LocalDate.now();
        month = date.getMonthValue();
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        int today = date.getDayOfMonth();

        for(int i = 1; i < value; i ++) {
            System.out.println(" ");
        }
        while(date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.printf("*");
            else
                System.out.println(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1 ) System.out.println();
        }

    }

}
