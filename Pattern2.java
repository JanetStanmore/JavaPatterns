import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of rows & columns: ");
        int num = inp.nextInt();
        for(int row = 0; row<num; row++) {
            for(int col=0; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
