import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = inp.nextInt();

        for(int row=1; row<=num; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
