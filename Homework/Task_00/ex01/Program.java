package ex01;

public class Program {


    private static int counterBugs = 0;
    public static void addBug() {
        counterBugs++;
        System.out.println("Bug will be added.");
    }

    public static boolean isHaveBugs() {
        return counterBugs > 0;
    }


    public static void main(String[] args) {
        System.out.println("Does Program have bugs?");
        System.out.println(isHaveBugs());
        addBug();
        System.out.println("Does Program have bugs now?");
        System.out.println(isHaveBugs());
    }
}