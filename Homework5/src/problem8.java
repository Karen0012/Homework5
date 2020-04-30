public class problem8 {
    public static void main(String[] args) {
        int[] a = {8, 9, 5, 100, 78};
        int d;
        for (int i = 0; i <=a.length/2; i++) {
            d = a[a.length-1 - i];
            a[a.length-1 - i] = a[i];
            a[i] = d;
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i < a.length-1) {
                System.out.print(a[i] + ",");
            } else System.out.print(a[i]);
        }
        System.out.print("]");
    }
}
