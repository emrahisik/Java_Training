package Switches;

public class DayNames {

    public static void printDayOfWeek (int day) {
        String dayOfWeek = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> {             //Example of yielding a result
                yield "Saturday";
            }
            default -> {
                yield "Not a valid day number";
            }
        };
        System.out.println(dayOfWeek);
    }

    public static void main(String[] args) {
        printDayOfWeek(2);
        printDayOfWeek(12);
        printDayOfWeek(-1);
        printDayOfWeek(0);
    }
}
