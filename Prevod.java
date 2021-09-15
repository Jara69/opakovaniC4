import java.util.*;

public class Prevod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cislo");
        int input = sc.nextInt();
        preved(input);
    }

    public static void preved(int input) {

        int dvojkova[] = new int[input];
        int index = 0;
        while (input > 0) {
            dvojkova[index++] = input % 2;
            input = input / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(dvojkova[i]);
        }
        System.out.println();
    }
}
