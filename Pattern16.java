public class Pattern16 {
    public static void main(String[] args) {
        int a=65;
        for(int r=1; r<=5; r++) {
            for(int c=1; c<=r; c++) {
                System.out.print((char)a + " ");
            }
            System.out.println();
            a+=1;
        }
    }
}
