// This program demonstrates the use of enums with 'if' and 'switch' statements in Java

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumIfSwitchExample {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        // Using 'if' statement
        if (today == Day.FRIDAY) {
            System.out.println("Today is Friday!");
        } else {
            System.out.println("Today is not Friday.");
        }

        // Using 'switch' statement
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday.");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday.");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }
}
