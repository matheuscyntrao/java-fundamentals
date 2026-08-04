package modulo_2;

import java.time.LocalDate;

public class LocalDateJavaLibrary {

    // Instance of Date has a state - namely, a particular point in time
    // Although you don't need to know this when you use the Data class, the time is represented by the number of milliseconds (positive or negative)
    // 00:00:00 UTC, Januray , 1970 is the Coordinated Universal Time, the scientific time standard which is, for practical purposes.
    // The same as the more familiar GMT, or Greenwich Mean Time.

    // But as it turns out, the Date class is not very useful for manupulating the kind of calendar information that humans use for dates,
    // such as "December 31, 1999". This particular description of a day follows the Gregorian calendar,
    // which is the calendar used in most countries of the world. The same point in time would be described quite differently in the Chinese of Hebrew lunar
    // calendar, not to mention the calendar used by your customers from Mars.

    static void main() {

        // Date point in time
        // LocalDate familiar calendar notation
        // Java 8 introduced quite a few other classes for manipulating various aspects of date and time.
        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
        int year = newYearsEve.getYear();
        int month = newYearsEve.getMonthValue();
        int day = newYearsEve.getDayOfMonth();

        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        year = aThousandDaysLater.getYear();
        month = aThousandDaysLater.getMonthValue();
        day = aThousandDaysLater.getDayOfMonth();

        // The LocalDate class has encapsulated instance fields to maintain the date to which it is set.
        // Whitout looking at the source code, it is impossible to know the representation that the class uses internally.
        // But, of course, the point of encapsulation is that this doesn't matter.
        // What matters are the methods that a class exposes.

    }

}
