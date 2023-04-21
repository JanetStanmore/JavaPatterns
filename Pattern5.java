public class Pattern5 {
    public static void main(String[] args) {
        int num = 5;
        for(int row=0; row<num; row++) {
            for(int col=num; col>row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row=num; row>0; row--) {
            for(int col=row; col>0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=5; i>0; i--) { //--
            for(int j=0; j<i; j++) { //++
                System.out.print("*");
            }
            System.out.println();
        }

        for(int x=0; x<5; x++) { //++
            for(int y=0; y<5-x; y++) { //++
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
