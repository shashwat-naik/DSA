public class Equilibrium_index {
    // public int findEquilibriumIndex(int[] A) {
    public static int findEquilibriumIndex(int[] A) {
        long sum1 = 0;
        for (int i = 0; i < A.length; i++) {
            sum1 += A[i];
        }

        long sum2 = 0;
        int equilibriumIndex = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            sum1 -= A[i];

            if (sum1 == sum2) {
                equilibriumIndex = i;
                break;
            }
            sum2 += A[i];
        }

        if (equilibriumIndex == Integer.MAX_VALUE) {
            equilibriumIndex = -1;
        }

        return equilibriumIndex;
    }

    public static void main(String[] args) {
        // Equilibrium_index finder = new Equilibrium_index();
        int[] array = { 1, 7, 3, 6, 5, 6 };

        // int result = finder.findEquilibriumIndex(array);
        int result = findEquilibriumIndex(array);
        System.out.println("Equilibrium Index: " + result);
    }
}
