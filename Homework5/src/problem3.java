public class problem3 {
    public static void main(String[] args) {

        String[] i = {"woodsdfghj", "edfgh", "ghcwv", "fejbei"};
        String j = "wood";
        int d = 0;
        for (int k = 0; k < 4; k++) {
            if (i[k] == j) {
                d = d + 1;
            }
        }
        if (d == 0) {
            System.out.println("Not found");
        } else System.out.println("Correct!!!");

    }
}