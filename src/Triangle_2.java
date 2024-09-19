public class Triangle_2 {
    public static void main(String[] args) {
//       1
//       0 1
//       1 0 1
//       0 1 0 1
//       1 0 1 0 1
            int n =5;
            int a = 1;
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col%a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
