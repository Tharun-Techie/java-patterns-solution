public class Number_Lhalf_triangle {
    public static void main(String[] args) {
//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
    int n =5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
