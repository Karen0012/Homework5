public class problem6 {
    public static void main(String[] args) {
        int[] a = {-45, 1, 3, -6, 8, 4, -99};
        int min = a[0], max = a[0];
        for (int i = 0; i <= 6; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        for (int i = 0; i <= 6; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
