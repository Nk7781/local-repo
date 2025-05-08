import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter the amount :");
		double principal=sc.nextDouble();
		double intrestRate=8/100;
		System.out.print("Enter the starting time(yyyy-mm-dd):");
		sc.next();
		String date=sc.next();
		
		LocalDate currentDate= LocalDate.now();
		LocalDate startingDate=LocalDate.parse(date);
		long daysBetween=ChronoUnit.DAYS.between(startingDate, currentDate);
		
		double intrestAmount=(principal*(daysBetween/365)*intrestRate)/100;
		System.out.println("Intrest Amount"+intrestAmount);
		System.out.println("Total Amount"+(principal+intrestAmount));
	}

}
