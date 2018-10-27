import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog reksio = new Dog("Reksio");       // reksio - obiekt klasy Dog
        //reksio.name = "Reksio";
        reksio.bark();                  // wywołanie funkcji w klasie Dog

        System.out.println(reksio.name + " miał " + reksio.getNumberOfLegs() + " nogi.");
        reksio.setNumberOfLegs(3);
        System.out.println(reksio.name + " ma teraz " + reksio.getNumberOfLegs() + " nogi.");
        System.out.println("LOL");      //cmd + shft + i - pomoc, kursor w miejscu gdzie potrzeba wyjaśnień
        Dog.sayHau();   // odwołanie do metody sayHau w klasie Dog, (!!) nie trzebya mieć zdefiniowanego obiektu, żeby ją wywołać
    }


}
