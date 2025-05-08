import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Question7 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		System.out.println("Current date:"+date);
		System.out.println("Current Time:"+time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		System.out.println("The day two weeks from now:"+date.plus(2,ChronoUnit.WEEKS));
		
		DateTimeFormatter formater =DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println("Date in given format"+date.format(formater));
	}

}
