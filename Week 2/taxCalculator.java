public class taxCalculator {
    public static void main(String[] args) {
        System.out.println(calculateTotal(50.00, 0.09, 0.10));
        System.out.println(calculateTotal(56.00, 0.09, 0.10));
        System.out.println(calculateTotal(51.00, 0.09, 0.10));
        System.out.println(calculateTotal(54.00, 0.09, 0.10));
        System.out.println(calculateTotal(56.00, 0.09, 0.10));   
    }
    public static double calculateTotal(double subTotal, double taxRate, double tipRate) {
        double tax = taxRate * subTotal;
        double tip = tipRate * subTotal;
        double total = subTotal + tax + tip;
        return total;
    }
}