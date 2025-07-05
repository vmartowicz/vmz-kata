package fr.vmz.kata.leapyear;

public class LeapYears {
    public static boolean isLeap(int year) {
        return isDivideBy400(year);
    }

    private static boolean isDivideBy400(int year) {
        return year % 400 == 0;
    }


}
