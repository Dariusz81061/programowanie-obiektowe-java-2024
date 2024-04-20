public class Car {
    private String name;
    private String color;
    private int year;

    Car() {
        this.name = "Mercedes";
        this.color = "Red";
        this.year = 2018;
    }

    Car(String color) {
        this.name = "Mercedes";
        this.color = color;
        this.year = 2018;
    }

    public String InfoCar() {
        return "Name: " + name + ", " +
                "Color: " + color + ", " +
                "Year: " + year;
    }
}
