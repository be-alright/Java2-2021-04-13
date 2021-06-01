package car;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Car {
    String id;
    Date enter;   // public /privite/ protected(放Date前面)
//    int enterHour = 8;
//    int enterMinute = 30;
    public Car(String id){
        this.id = id;
        enter = new Date();
    }
    public Car(String id,String time){
        this.id = id;
       // enter = new Date();
        Calendar now = Calendar.getInstance();
        String[] tokens = time.split(":");
        System.out.println("t0"+tokens[0]);
        System.out.println("t1"+tokens[1]);
        now.set(Calendar.HOUR_OF_DAY,8);
        enter = now.getTime();

    }

    public Date getEnter() {
        return enter;     //封裝
    }
}
//日期 時間等數據資料處理