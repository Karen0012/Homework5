public class problem5 {
    public static void main(String[] args) {
        char[] a={'s', 'h', 'h','l', 'h'};
        char b='h';
        int sum=0;
        for (int i = 0; i < 5; i++) {
            if(a[i]==b){
                sum=sum+1;
            }
        }
        System.out.println(sum);
    }
}
