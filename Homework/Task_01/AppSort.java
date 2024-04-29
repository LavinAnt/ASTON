
import utils.ShellSort;
import java.util.List;

public class AppSort {
    public static void main(String[] args) {
        System.out.println("TASK_01.EX_00:");

        int[] arr = {12, 34, 54, 2, 3};

        System.out.println("Array before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        ShellSort.sort(arr);

        System.out.println("\nArray after sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
