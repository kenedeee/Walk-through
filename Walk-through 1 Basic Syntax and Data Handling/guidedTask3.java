import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class guidedTask3{
        public static void main(String[] args){
            LocalDateTime currentDate = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
            String formattedDateAndTime = currentDate.format(formatter);

            System.out.println("Today's Date and Time: " + formattedDateAndTime);
       } 
}
