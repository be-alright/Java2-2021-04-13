package car;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        int fee =30;
        Map<String,Car> cars = new HashMap<>();
        Car car = new Car("abc-123","07:40");
        Car car1 = new Car("bcd-123","08:30");
        Car car2 = new Car("cde-123","09:20");
        cars.put(car.id,car);
        cars.put(car1.id,car1);
        cars.put(car2.id,car2);
        String id = "abc-123";
        Car car3 = cars.get(id);
        if(car==null) {
            System.out.println("Car may not found");
        }else{
            Date now = new Date();
            long ms = now.getTime()-car.enter.getTime();
            long mins = ms/(1000*60);
            System.out.println(mins);
        }
    }


}
