public class Main {
    public static void main(String[] args) {
        // Test number of leap years
        System.out.println("Leap Years from 2000 to 2025: " + APCalendar.numberOfLeapYears(2000, 2025)); // Should include 2000, 2004, 2008, 2012, 2016, 2020, 2024

        // Test day of week
        System.out.println("Day of week (1/5/2019): " + APCalendar.dayOfWeek(1, 5, 2019));  // Expect 6 (Saturday)
        System.out.println("Day of week (1/10/2019): " + APCalendar.dayOfWeek(1, 10, 2019)); // Expect 4 (Thursday)
    }
}
