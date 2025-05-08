import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question8 {

	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("Current date and time : "+datetime);
		DateTimeFormatter formater =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("Formated date and time: "+datetime.format(formater));
	}

}
