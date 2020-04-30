import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input size of array:");
      int n = scanner.nextInt();
        int[] u=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input an element:"+i);
            u[i]=scanner.nextInt();
        }

    }
}
