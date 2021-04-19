public class Car {

    private String make;
    private String color;
    private int year;
    private String model;
    private int age;
    
    public Car(String _make, String _model, String _color, int _year, int _age) {
        this.make = _make;
        this.model = _model;
        this.color = _color;
        this.year = _year;
        this.age = _age;
    }

    public void honk() {
        System.out.println("honk");
    }

    public String getMakeAndModel() {
        return this.make + " " + this.model;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
}