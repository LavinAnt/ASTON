package utils;

public final class BugUtils {
    private static int counterBugs = 0;

    public static void addBug() {
        counterBugs++;
        System.out.println("Bug will be added.");
    }

    public static boolean isHaveBugs() {
        return counterBugs > 0;
    }
    private BugUtils() {
    }
}