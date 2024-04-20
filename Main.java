public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Car car = new Car();
        System.out.println(car.InfoCar());

        Car car2 = new Car("Różowy");
        System.out.println(car2.InfoCar());
    }
}
