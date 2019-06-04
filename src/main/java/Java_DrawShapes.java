import java.util.Scanner;

public class Java_DrawShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Menu: ");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle (at bottom-left)");
        System.out.println("3. Draw the square triangle (at top-left)");
        System.out.println("4. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1 :
                for (int i=1;i<=3;i++) {
                    System.out.println();
                    for (int j=1;j<=7;j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 2 :
                for (int i=1;i<=7;i++) {
                    System.out.println();
                    for (int j=1;j<i;j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3 :
                for (int i=5;i>=1;i--) {
                    System.out.println();
                    for (int j=1;j<=i;j++) {
                        System.out.print("*"+"");
                    }
                }
                break;
            case 4 :
                for (int i = 0; i < 9; i++) {
                    System.out.println(" ");
                    for (int j = 0;j<19;j++){
                        if (j<10-i | j>(10-i)+2*i) System.out.print(" ");
                        else System.out.print("*");
                    }
                }
                break;
            case 0 :
                System.exit(0);
                default:
                    System.out.println("out of ability");
        }
    }
}
