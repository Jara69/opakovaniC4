import java.util.*;

public class Vzor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CISLOOOO");
        String cislo = sc.nextLine();

        for (int i = 0; i < cislo.length(); i++) {
            System.out.println(cislo.substring(0, cislo.length() - i));

        }

    }
}
