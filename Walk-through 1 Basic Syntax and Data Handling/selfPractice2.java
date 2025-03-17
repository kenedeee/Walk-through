import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class selfPractice2{
        public static void main(String[] args){
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM-dd-yyyy");
            String formattedDateAndTime = currentDateTime.format(formatter);

            System.out.println("Current Time and Date: " + formattedDateAndTime);
        }
}
