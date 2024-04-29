import entity.Human;
import utils.BugUtils;

public class App {
    public static void main(String[] args) {

        System.out.println("EX_00:");

        try {
            Class<?> People = Class.forName("entity.Human");
            ClassLoader classLoader = People.getClassLoader();
            System.out.println("Загрузчик класса: " + classLoader);
            System.out.println("Имя класса: " + People.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден: " + e.getMessage());
        }

        System.out.println("EX_01:");

        System.out.println("Does Program have bugs?");
        System.out.println(BugUtils.isHaveBugs());
        BugUtils.addBug();
        System.out.println("Does Program have bugs now?");
        System.out.println(BugUtils.isHaveBugs());

    }
}
