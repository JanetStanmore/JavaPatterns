import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of row & column: ");
        int num = inp.nextInt();

        for(int row=1; row<=num; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
