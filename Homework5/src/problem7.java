public class problem7 {
    public static void main(String[] args) {
        int[] a={8,9,5,100,78};
        int [] b=new int[5];
        for (int i = 0; i <= 4; i++) {
            b[4-i]=a[i];

        }
        System.out.print("[");
        for (int i = 0; i <=4 ; i++) {
            if (i<4) {
                System.out.print(b[i] + ",");
            }else System.out.print(b[i]);
        }System.out.print("]");
    }
}
