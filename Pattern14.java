public class Pattern14 {
    public static void main(String[] args) {
        int a=65;
        for(int r=1; r<=5; r++) {
            for(int c=0; c<r; c++) {
                System.out.print((char)(a + c) + " ");
            }
            System.out.println();

        }
    }
}
