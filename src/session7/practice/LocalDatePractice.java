package session7.practice;

import java.time.LocalDate;

public class LocalDatePractice {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate afterTenDays = today.plusDays(10);
        System.out.println(afterTenDays);

        if(today.isBefore(afterTenDays)){
            System.out.println("Today is before tomorrow?!");
        }
    }


}
