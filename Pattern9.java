public class Pattern9 {
    public static void main(String[] args){
        for(int r=1; r<=5; r++){
            for(int s=1; s<=5-r; s++)
                System.out.print(" ");

            for(int c=1; c<=2*r-1; c++)
                System.out.print("*");

            System.out.println();
        }
        for(int r=5; r>0; r--){
            for(int s=1; s<=5-r; s++)
                System.out.print(" ");

            for(int c=1; c<=2*r-1; c++)
                System.out.print("*");

            System.out.println();
        }
    }
}
