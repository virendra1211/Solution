package localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/*
 There have been several problems with the existing date and time related classes in java, some of them are:

Java Date Time classes are not defined consistently, we have Date Class in both java.util as well as java.sql packages. Again formatting and parsing classes are defined in java.text package.
java.util.Date contains both date and time values whereas java.sql.Date contains only date value. Having this in java.sql package doesn’t make any sense. Also, both the classes have the same name, which is a very bad design itself.
There are no clearly defined classes for time, timestamp, formatting, and parsing. We have java.text.DateFormat abstract class for parsing and formatting need. Usually, the SimpleDateFormat class is used for parsing and formatting.
All the Date classes are mutable, so they are not thread-safe. It’s one of the biggest problems with Java Date and Calendar classes.
Date class doesn’t provide internationalization, there is no timezone support. So java.util.Calendar and java.util.TimeZone classes were introduced, but they also have all the problems listed above.
 */
// https://www.digitalocean.com/community/tutorials/java-8-date-localdate-localdatetime-instant
/*
 *Immutability: All the classes in the new Date-Time API are immutable and good for multithreaded environments.

Separation of Concerns: The new API separates clearly between human-readable date time and machine time (Unix timestamp). It defines separate classes for Date, Time, DateTime, Timestamp, Timezone, etc.

Clarity: The methods are clearly defined and perform the same action in all the classes. For example, to get the current instance we have now() method. There are format() and parse() methods defined in all these classes rather than having a separate class for them.

All the classes use Factory Pattern and Strategy Pattern for better handling. Once you have used the methods in one of the classes, working with other classes won’t be hard.

Utility operations: All the new Date-Time API classes come with methods to perform common tasks, such as plus, minus, format, parsing, getting the separate part in date/time, etc.

Extendable: The new Date Time API works on the ISO-8601 calendar system but we can use it with other non-ISO calendars as well.
 */
public class LocalDatePractice {

	public static void main(String[] args) {
		//Current Date
				LocalDate today = LocalDate.now();
				System.out.println("Current Date="+today);
				
				//Creating LocalDate by providing input arguments
				LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
				System.out.println("Specific Date="+firstDay_2014);
				
				
				//Try creating date by providing invalid inputs
				//LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
				//Exception in thread "main" java.time.DateTimeException: 
				//Invalid date 'February 29' as '2014' is not a leap year
				
				//Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
				LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
				System.out.println("Current Date in IST="+todayKolkata);

				//java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
				//LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));
				
				//Getting date from the base date i.e 01/01/1970
				LocalDate dateFromBase = LocalDate.ofEpochDay(365);
				System.out.println("365th day from base date= "+dateFromBase);
				
				LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
				System.out.println("100th day of 2014="+hundredDay2014);
	}

}
