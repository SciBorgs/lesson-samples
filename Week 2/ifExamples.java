public class ifExamples {
    public static void main(String[] args) {
        int x = 5;
        int y = 20;
        
        System.out.println("Example 1 output:");

        if (x < 4 && y > 15) {
            System.out.println("1");
        } else if (x > 4) {
            System.out.println("2");
        } else if (y > 15) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

        System.out.println("Example 2 output:");

        if (x < 4 && y > 15) {
            System.out.println("1");
        }
        if (x > 4) {
            System.out.println("2");
        }
        if (y > 15) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
