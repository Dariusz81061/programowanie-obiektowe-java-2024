public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Car car = new Car();
        System.out.println(car.InfoCar());

        Car car2 = new Car("Różowy");
        System.out.println(car2.InfoCar());

        Car car3 = new Car("Czarny", 2024);
        System.out.println(car3.InfoCar());

        // Bardzo zła praktyka
        Car car4 = car3;
        // odkomentowanie spowoduje nadpisanie year w obiekcie car3
        // car4.year = 1988;

        System.out.println(car3.InfoCar());
        System.out.println(car4.InfoCar());



    }
}
