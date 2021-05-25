package car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date d = sdf.parse("08:20");
            System.out.println(d);

        }catch (ParseException e){
            e.printStackTrace();
        }
        //
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());


    Car car = new Car("abc-123");
    Car car1 = new Car("def-234","07:50");
    System.out.println(car.enter);

        Date now = new Date();
        System.out.println(now.getTime());

        long dis =now.getTime()- car.enter.getTime();
        System.out.println(dis);
    }
}
