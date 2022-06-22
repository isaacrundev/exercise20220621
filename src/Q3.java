import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {

        Car car1 = new Car("Missing Link", "Asurada GSX", 1991);
        Car car2 = new Car("Tesla", "Model 3", 2017);
        Car car3 = new Car("Ford", "Model T", 1908);

        ArrayList<Integer> carList = new ArrayList<>();
        carList.add(car1.getYear());
        carList.add(car2.getYear());
        carList.add(car3.getYear());

    }

}
