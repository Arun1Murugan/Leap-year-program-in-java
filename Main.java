public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        boolean responseOfIsLeapYear = isLeapYear(2048); // method call
        if (responseOfIsLeapYear) {
            // If isLeapYear method is True.
            System.out.println("it is leap year.");
        } else {
            // If isLeapYear method is False.
            System.out.println("it is not leap year.");
        }
    }
    // Method
    public static boolean isLeapYear(int year) {
        // year greater than or equal to 1000 and less than or equal to 9999.
        if (year >= 1000 && year <= 9999) {
            /* year fully divided by 400 or Not year divided by 100. And year fully divided by 4,
             It returns True   */
            if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
                return true;
            }
        }
        // if block condition not satisfy, It returns False.
        return false;
    }
}