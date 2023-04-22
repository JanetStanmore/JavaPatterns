public class Pattern12i {
    public static void main(String[] args) {
        for(int r=1; r<=4; r++) {
            for(int c=1; c<=r; c++)
                System.out.print(c + " ");

            for (int s=1; s<=(4-r)*4; s++)
                System.out.print(" ");

            for(int m=r; m>=1; m--)
                System.out.print(m + " ");

            System.out.println();
        }

        for(int r=4; r>=1; r--) {
            for(int c=r; c>=1; c--)
                System.out.print(c + " ");

            for (int s=1; s<=(4-r)*4; s++)
                System.out.print(" ");

            for(int m=1; m<=r; m++)
                System.out.print(m + " ");

            System.out.println();
        }
    }
}
