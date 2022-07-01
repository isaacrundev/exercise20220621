import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Missing Link", "Asurada GSX", 1991));
        carList.add(new Car("Tesla", "Model 3", 2017));
        carList.add(new Car("Ford", "Model T", 1908));

        carList.sort(null);

        for (Car car : carList) {
            System.out.println("Element:" + car);
        }
    }

}

class Car implements Comparable<Car> {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
    }

    @Override
    public int compareTo(Car o) {
        if (year == o.year) {
            return 0;
        } else if (year > o.year) {
            return 1;
        } else {
            return -1;
        }
    }

}
