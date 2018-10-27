public class Person_Test {
    public static void main(String[] args) {
        Klasa_osoby Stefan = new Klasa_osoby("Stefan",45,false,Gender.MALE);
        Klasa_osoby Stefan1 = new Klasa_osoby("Stefan",45,false,Gender.MALE);
        System.out.println(Stefan);

        System.out.println("Porównanie 1: " + (Stefan == Stefan1));          // powównujemy adresy obiektów, które są różne w pamięci komputera, więc zwraca false
        System.out.println("Porównanie 2: " + Stefan.equals(Stefan1));     // porównanie zawartości (cech) obiektów

    }
}
