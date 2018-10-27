public class Zadanie2 {
    public static void main(String[] args) {
        String[] tablica = {"Monika", "Ola", "Aleksandra"};
        int sum = 0;
        for (int i = 0; i < tablica.length; i++){
            System.out.println("Wybrałeś " + tablica[i].toUpperCase());
            System.out.println("Długość: " + tablica[i].length());
            sum += tablica[i].length();     // += to to samo co sum = sum + ...
        }
        System.out.println("Długość całej tablicy: " + sum);
    }
}
