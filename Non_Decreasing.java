import java.util.*;

public class Non_Decreasing {
    public static boolean isPossible(int[] arr, int n) {
        if (n < 2)
            return true;
        int c = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                c++;
            }
            if (c > 1)
                return false;

            // if (i != 1 && arr[i - 2] > arr[i]) {
            if (i >= 2 && arr[i - 2] > arr[i]) {
                arr[i] = arr[i - 1];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 1, 4, 5 };
        boolean result = isPossible(arr, n);

        System.out.println("The following array is: " + result);
    }
}
