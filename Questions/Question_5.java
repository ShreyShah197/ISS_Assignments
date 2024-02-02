package questions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Question_5 {

	public static void main(String[] args) {
		
		String Date_String = LocalDate.now().toString();

        System.out.println(Date_String);

        LocalDate originalDate = LocalDate.parse(Date_String);

        DateTimeFormatter format_1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String new_Date1 = originalDate.format(format_1);
        System.out.println("Format Date1: " + new_Date1);
        DateTimeFormatter format_2 = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        String new_Date2 = originalDate.format(format_2);
        System.out.println("Format Date2: "+new_Date2);
        DateTimeFormatter format_3 = DateTimeFormatter.ofPattern("yyyy-dd-MMM");
        String new_Date3 = originalDate.format(format_3);
        System.out.println("Format Date3:"+new_Date3);
        DateTimeFormatter format_4 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        String new_Date4 = originalDate.format(format_4);
        System.out.println("Format Date4:"+new_Date4);
	}

}
