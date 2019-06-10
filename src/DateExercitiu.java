import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class DateExercitiu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DayOfWeek dayOfWeek=LocalDate.parse(date,formatter).getDayOfWeek();
 //       LocalDate localDate = LocalDate.parse(date, formatter);
//        localDate = localDate.plusMonths(3);
 //       String date1 = localDate.format(formatter);
//        System.out.println(localDate); // 2019-05-26
        if (localDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) || localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            System.out.println("Weekend!");
        } else {
            System.out.println("DU-te la munca");
        }
    }
}

