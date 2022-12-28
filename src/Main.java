import java.util.Scanner;

/*
 *@Author Emircan Aktas - 28.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, a = 0, b = 1;
        System.out.print("How many series to enter:");
        number = inp.nextInt();

        System.out.print("Result :");

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < number; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}