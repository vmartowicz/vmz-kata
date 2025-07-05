package fr.vmz.kata.leapyear;

public class LeapYears {
    public static boolean isLeap(int year) {
        if (isDivideBy400(year)) {
            return true;
        }
        if (isDivideBy100(year)) {
            return true;
        }
        return false;
    }

    private static boolean isDivideBy100(int year) {
        return isDivideBy(year, 100);
    }

    private static boolean isDivideBy400(int year) {
        return isDivideBy(year, 400);
    }

    private static boolean isDivideBy(int year, int divide) {
        return year % divide == 0;
    }


}
