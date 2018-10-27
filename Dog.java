public class Dog {          // Dog - klasa, ogólny schemat
    String name;            // name - pole, cecha
    private int numberOfLegs;

    public int getNumberOfLegs() {      // Getter - metoda, zwraca wartość, daje dostęp do przeczytania ale nie do zmiany
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {     // Setter - metoda, zwraca wartość, daje dostęp do przeczytania i zmiany
        this.numberOfLegs = numberOfLegs;
    }

    public Dog() {
        this.numberOfLegs = 4;
    }

    public Dog(String nazwa) {
        this();                 // odwołanie do pola bez parametrów tu: Dog(); musi być na początku
        this.name = nazwa;
    }

    public void bark(){     // metoda - funkcja dla klasy
        System.out.println(name + " mówi Hau Hau");
    }

    public static void sayHau(){
        System.out.println("hau");
    }
}
