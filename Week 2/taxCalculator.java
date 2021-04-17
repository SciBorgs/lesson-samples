class taxCalculator {
    public static void main(String[] args) {
        System.out.println(calcTotal(2.00, 0.08875, 0.19));
    }

    static double calcTotal(double subTotal, double taxRate, double tipRate) {
        double tax = subTotal * taxRate;
        double tip = subTotal * tipRate;
        /*return subTotal + tax + tip;*/
        double total = subTotal + tax + tip;
        return Math.floor(total * 100) / 100;
    }
}   





/* 
        if (x < 4 && y > 15) {
            System.out.println("1");
        } else if (x > 4) {
            System.out.println("2");
        } else if (y > 15) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
*/