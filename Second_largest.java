import java.util.*;

public class Second_largest {
    public static int findSecondLargest(int n, int[] arr) {
        Arrays.sort(arr);
        int i = n - 1;
        int j = n - 2;

        while (j >= 0 && arr[j] == arr[i]) {
            i--;
            j--;
        }
        if (j >= 0)
            return arr[j];
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 6, 8, 7 };
        int result = findSecondLargest(arr.length, arr);

        if (result != -1) {
            System.out.println("Second Largest Element: " + result);
        } else {
            System.out.println("There is no second largest element.");
        }
    }
}