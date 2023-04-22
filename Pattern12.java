public class Pattern12 {
    public static void main(String[] args) {
        for(int r=1; r<=4; r++){
            for(int a=1; a<=r; a++)
                System.out.print(a + " ");

            for(int b=1; b<=(4-r)*4; b++)
                System.out.print(" ");

            for(int c=r; c>=1; c--)
                System.out.print(c + " ");

            System.out.println();
        }
    }
}
