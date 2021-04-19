/**
 * ImmutableStrings
 * 
 * Quick example on how strings are immutable.
 */
public class ImmutableStrings {
    public static void main(String[] args) {
        String pieType = "pie";
        System.out.println("Original pieType: " + pieType); // This function prints out the value of pieType, which is
                                                            // pie

        String newPieType = pieType.toUpperCase(); // This doesn't modify the existing string but returns a new one, as we'll see below

        System.out.println("pieType after toUpperCase: " + pieType); // Did not change!
        System.out.println("newPieType: " + newPieType); // Our newPieType variable has the uppercased pieType
    }
}