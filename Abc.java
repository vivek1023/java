```java
class Car {
    String brand;

    // Constructor initializing the brand field with "Ford"
    public Car() {
        this.brand = "Ford";
    }

    public String getBrand() {
        return brand;
    }

    void run() {
        System.out.println("Car is running...");
    }
}

public class Sample {
    public static void main(String[] args) {
        Car ford = new Car();
        String brandValue = ford.getBrand();
        System.out.println("Brand: " + brandValue);
    }
}
```
