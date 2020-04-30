import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        int[] g = new int[4];

        for (int i =0; i<4; i++) {
            Scanner scanner=new Scanner(System.in);
            g[i]=scanner.nextInt();
        }
        System.out.print("g[i]={");
        for (int i = 0; i <4 ; i++) {
            System.out.print(g[i]+",");
        }
        System.out.println("}");
    }
}
