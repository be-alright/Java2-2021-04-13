package car;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
    String id;
    Date enter;
//    int enterHour = 8;
//    int enterMinute = 30;
    public Car(String id){
        this.id = id;
        enter = new Date();
    }
    public Car(String id,String time){
        this.id = id;
       // enter = new Date();

    }
}
