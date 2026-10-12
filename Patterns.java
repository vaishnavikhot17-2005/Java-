
import java.util.Scanner;

class Patterns {

    // First pattern
    static void pattern1(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Second pattern
    static void patterns2(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //third pattern
    static void pattern3(int number){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
        System.out.println();

    }

    // One main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int number = sc.nextInt();

        pattern1(row);
        patterns2(number);

        sc.close();
    }


}
