public class Pattern123 {
    public static void main(String[] args) {
        for(int r=1; r<=3; r++) {
            for(int s=1; s<=3-r; s++) {
                System.out.print(" ");
            }
            for(int c=1; c<=r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int r=3; r>=1; r--) {
            for(int c=1; c<=r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ---*
// --**
// -***
// ***
// **
// *