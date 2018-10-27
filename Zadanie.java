import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        System.out.println("Daj dzielną");
        Scanner scanner = new Scanner(System.in);
        int liczba1 = scanner.nextInt();
        System.out.println("Wybrałeś " + liczba1);

        System.out.println("Daj dzielnik");
        int liczba2 = scanner.nextInt();
        System.out.println("Wybrałeś " + liczba2);

        while(liczba2==0){
            System.out.println("Wybrałeś 0, nie wolno dzielić przez 0!");
            System.out.println("Daj dzielnik");
            liczba2 = scanner.nextInt();
            System.out.println("Wybrałeś " + liczba2);
        }

            float x = liczba1/ (float) liczba2;
            System.out.println(liczba1 + " / " + liczba2 + " = " + x);
    }
}
