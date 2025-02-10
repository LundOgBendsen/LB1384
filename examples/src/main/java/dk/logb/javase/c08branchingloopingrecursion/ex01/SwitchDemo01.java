package dk.logb.javase.c08branchingloopingrecursion.ex01;

public class SwitchDemo01 {
    public static void main(String[] args) {
        System.out.println(getWordFromNumber(1));
        System.out.println(getWordFromNumber(2));
        System.out.println(getWordFromNumber(3));

        System.out.println(daysOfMonth("jan"));
        System.out.println(daysOfMonth("feb"));
        System.out.println(daysOfMonth("may"));
        System.out.println(daysOfMonth("dec"));
        System.out.println(daysOfMonth("xyz"));
    }

    /*
        Demonstrates a switch expression evaluating to a String
     */
    private static String getWordFromNumber(int number) {
        return switch(number) {
            case 1: yield "one";
            case 2: yield "two";
            default: yield "something else";
        };
    }

    /*
        Demonstrates a switch expression evaluating to an int
     */
    private static int daysOfMonth(String s) {
        return switch (s) {
            case null -> throw new NullPointerException("null not allowed for month");
            case "jan", "mar", "may", "jul", "aug", "sep", "dec" -> 31;
            case "feb" -> 28;
            case "apr", "jun", "nov" -> 30;
            default -> throw new IllegalArgumentException("unknown month (jan-dec)");
        };
    }


}
