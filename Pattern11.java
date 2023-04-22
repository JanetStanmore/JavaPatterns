public class Pattern11 {
    public static void main(String[] args) {
        for(int r=1; r<=5; r++) {
            for(int c=0; c<r; c++)
                System.out.print((r+c)%2);
            System.out.println();
        }

        for(int r=5; r>=1; r--) {
            for(int c=0; c<r; c++) {
                System.out.print((r+c)%2);
            }
            System.out.println();
        }
    }
}
