/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
*/


package eserciziCorsoJava;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		OffsetDateTime data= OffsetDateTime.parse("2002-03-01T13:00:00Z");
		
		System.out.println(data);
		
		String dateString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		
		System.out.println(dateString);
		
		String dateString1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		System.out.println(dateString1);
		
		String dateString2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		System.out.println(dateString2);
		
		
		
	}

}
