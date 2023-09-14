package aulaDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now()
;		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println();
		System.out.println(ZoneId.systemDefault());
		
		System.out.println(d04.getDayOfMonth());
		System.out.println(d04.getMonthValue());
		System.out.println(d04.getYear());
		System.out.println(d05.getHour());
		System.out.println(d05.getMinute());
		
	}

}
