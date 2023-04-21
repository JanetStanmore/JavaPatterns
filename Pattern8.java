public class Pattern8 {
    public static void main(String[] args) {
        for(int i=5; i>0; i--){
            for(int k=5-i; k>=1; k--)
                System.out.print(" ");

            for (int j=i*2-1; j>=1; j--)
                System.out.print("*");

            System.out.println();
        }

        // Alternative method

        for(int r=5; r>0; r--) {
            for(int s=1; s<=5-r; s++)
                System.out.print(" ");

            for (int c=1; c<=r*2-1; c++)
                System.out.print("*");

            System.out.println();
        }
    }
}
