// This program demonstrates the use of enum classes in Java

enum Day {
    MONDAY("Start of the work week"),
    TUESDAY("Second day of the work week"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost there"),
    FRIDAY("Last work day"),
    SATURDAY("Weekend!"),
    SUNDAY("Weekend!");

    private String description;

    // Constructor for the enum
    Day(String description) {
        this.description = description;
    }

    // Method to get the description
    public String getDescription() {
        return description;
    }
}

public class EnumClassExample {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
    }
}
