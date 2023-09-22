package session7.practice;

import java.sql.Timestamp;

public class TimeStampPractice {

    public static void main(String[] args) {
        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Timestamp " + currentTimeStamp);

        Timestamp timestamp1 = Timestamp.valueOf("2023-09-20 15:20:30.214");
        Timestamp timestamp2 = Timestamp.valueOf("2023-09-20 15:21:30.214");

        long differenceInSeconds = (timestamp1.getTime() - timestamp2.getTime()) / 1000;
        System.out.println(differenceInSeconds);
    }
}
