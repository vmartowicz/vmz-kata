package fr.vmz.kata.leapyear;

public class LeapYears {

    public static final int DIVIDE_BY_100 = 100;
    public static final int DIVIDE_BY_400 = 400;

    public static boolean isLeap(int year) {
        if (isDivideBy400(year)) {
            return true;
        }
        if (isDivideBy100(year)) {
            return true;
        }

        if (isDivideBy4(year) && !isDivideBy100(year)) {
            return true;
        }

        return false;
    }

    private static boolean isDivideBy4(int year) {
        return isDivideBy(year, 4);
    }

    private static boolean isDivideBy100(int year) {
        return isDivideBy(year, DIVIDE_BY_100);
    }

    private static boolean isDivideBy400(int year) {
        return isDivideBy(year, DIVIDE_BY_400);
    }

    private static boolean isDivideBy(int year, int divide) {
        return year % divide == 0;
    }


}
