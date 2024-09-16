public class Left_Half_rectangle {
//    *****
//    ****
//    ***
//    **
//    *

    public static void main(String[] args) {
        int n = 5;
        for(int row = 1;row<=n; row--){
            for(int col = n;col<=n-row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
