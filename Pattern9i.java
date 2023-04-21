public class Pattern9i {
    public static void main(String[] args) {
        for(int i=5; i>1; i--){
            for(int k=5-i; k>=1; k--)
                System.out.print(" ");

            for(int j=i*2-1; j>=1; j--)
                System.out.print("*");

            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for (int s=5-i; s>=1; s--)
                System.out.print(" ");

            for(int j=i*2-1; j>=1; j--)
                System.out.print("*");

            System.out.println();
        }
    }
}
