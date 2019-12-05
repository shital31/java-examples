package datediffrence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDiffrence {
    public static void main(String[] args) throws IOException {
        final SimpleDateFormat formatter=new SimpleDateFormat("dd/mm/yyyy");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String firstInput = reader.readLine();
        final String secondInput = reader.readLine();
        final LocalDate firstDate = LocalDate.parse(firstInput);
        final LocalDate secondDate = LocalDate.parse(secondInput);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        final  long months=ChronoUnit.MONTHS.between(firstDate,secondDate);
        final  long year=ChronoUnit.YEARS.between(firstDate,secondDate);
        System.out.println("Days between: " + days + "\n Months: " +months + "\n Year: "+year);
    }
}


