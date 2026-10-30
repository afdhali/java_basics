public class SwitchStatement {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);

        // switch lamda expression
        String dayNameLambda = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("The day is (using lambda): " + dayNameLambda);

        // yield statement
        String dayNameYield = switch (day) {
            case 1 -> {
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            case 3 -> {
                yield "Wednesday";
            }
            case 4 -> {
                yield "Thursday";
            }
            case 5 -> {
                yield "Friday";
            }
            case 6 -> {
                yield "Saturday";
            }
            case 7 -> {
                yield "Sunday";
            }
            default -> {
                yield "Invalid day";
            }
        };
        System.out.println("The day is (using yield): " + dayNameYield);


        // Ternary operator
        String dayNameTernary = (day == 1) ? "Monday" :
                (day == 2) ? "Tuesday" :
                (day == 3) ? "Wednesday" :
                (day == 4) ? "Thursday" :
                (day == 5) ? "Friday" :
                (day == 6) ? "Saturday" :
                (day == 7) ? "Sunday" : "Invalid day";
        System.out.println("The day is (using ternary operator): " + dayNameTernary);
    }
}
