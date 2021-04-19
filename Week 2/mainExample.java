public class mainExample {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = !x || x;
        if (y) {
            System.out.println("Y is true");
        } else if (x) {
            System.out.println("X is true");
        } else {
            System.out.println("Neither are true");
        }
        otherFunction();
    }

    private static void otherFunction() {
    }
}
