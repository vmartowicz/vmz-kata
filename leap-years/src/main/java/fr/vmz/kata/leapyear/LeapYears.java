package fr.vmz.kata.leapyear;

public class LeapYears {
    public static boolean isLeap(int year) {
        if ( isDivideBy400(year)) {
            return true;
        }
        if ( year % 100 ==0) {
            return true;
        }
        return false;
    }

    private static boolean isDivideBy400(int year) {
        return year % 400 == 0;
    }


}
