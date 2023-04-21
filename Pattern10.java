public class Pattern10 {
    public static void main(String[] args) {
        for(int r=1; r<=5; r++){
            for(int c=1; c<=r; c++)
                System.out.print("*");

            System.out.println();
        }
        for(int r=4; r>0; r--) {
            for (int c = 1; c <= r; c++)
                System.out.print("*");

            System.out.println();
        }


    }
}
