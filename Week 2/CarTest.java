public class CarTest { // CarTest.java
    public static void main(String[] args) { // Main function in action!
        Car car1 = new Car("Apple", "Car", "Silver", 2030, 0);
        car1.honk();
        System.out.println(car1.getMakeAndModel());
        System.out.println("Age is " + car1.getAge());
        car1.setAge(7);
        System.out.println("New age is " + car1.getAge());
        System.out.println(); // Line break
        Car car2 = new Car("Edison", "Model 4", "White Glass", 2025, -1);
        car2.honk();
        System.out.println(car2.getMakeAndModel());
    }
}
