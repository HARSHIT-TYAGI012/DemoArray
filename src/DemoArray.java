import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println();
        Scanner object = new Scanner(System.in);
        System.out.println("enter any 5 integer");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = object.nextInt();
        }
        System.out.println();
        System.out.println("printing array to check user input");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
            if (i < 4) {
                System.out.print(",");
            }
        }
    }
}