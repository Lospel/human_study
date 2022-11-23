package training09;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime myDataObj = LocalDateTime.now();
        System.out.println("Before formatting: "+myDataObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDate = myDataObj.format(myFormatObj);
        System.out.println("After formatting: "+formattedDate);
    }
}
