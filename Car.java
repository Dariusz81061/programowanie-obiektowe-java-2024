public class Car extends BaseAbstract implements CarInterface {
    private String name;
    private String color;
    private int year;

    Car() {
        this.name = "Mercedes";
        this.color = "Red";
        this.year = 2018;
        this.setSurName("Kowalska");
    }

    Car(String color) {
        this.name = "Mercedes";
        this.color = color;
        this.year = 2018;
    }

    Car(String color, int year) {
        this.name = "Mercedes";
        this.color = color;
        this.year = year;
    }

    public String InfoCar() {
        return "Name: " + name + ", " +
                "Color: " + color + ", " +
                "Year: " + year + ", " +
                "SurName: " + getSurName();
    }
    @Override
    public String InfoPerson() {
        return "";
    }
}
