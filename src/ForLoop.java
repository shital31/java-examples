public class ForLoop {
    public static void main(String args[]) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i = i++) {
            for (int j = 0; j < 3; j = j++) {

                System.out.println(array[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
