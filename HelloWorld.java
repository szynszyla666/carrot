public class HelloWorld {
    public static void main(String[] args) {        // static - wspólne dla wszystkich obiektów w klasie
        int i = 9;     //deklaracja zmiennej
        long ageOutOfUniverse=328759823094753L; //L na koncu - podkreslenie, ze liczba jest long
        float d = 8.9f;         //f - zmiennoprzecinkowa
        double b=8.9;           // double - wieksza zmiennoprzecinkowa
        char a = 'a';           // pojedyncze znaki
        boolean isJavaFun = true;

        int a1 = 567;
        int a2 = 45;
        float x = a1/ (float) a2;
        //(float) a2 - rzutowanie (zamiana) liczby na inny format;
        // przy operacjach gdzie wynik jest zmiennoprzecinkowy trzeba zamienic jedna zmienna na format zmiennoprzecinkowy

        String name = "trololo";
        int[] tablica = {1, 3, 5};   //deklaracja tablicy []
        double[] tablica1 = new double[10];
        tablica1[0]=0.9;
        int[][] tablica2 = new int[3][];    //tablica wielowymiarowa; trzy półki (0-2)
        tablica2[0]=new int[3];     //półka 0, 3 elementy
        tablica2[1]=new int[2];     // półka 1, 2 elementy
        tablica2[2]=new int[6];      // półka 2, 6 elementów
        tablica2[1][0] = 194;
        // % - modulo;

        System.out.println(tablica2[2][3]);

        System.out.println(i++);    // postinkrementacja; najpierw wyswietl, potem zmień
        System.out.println(i);      //
        System.out.println(++i);    // preinkrementacja

        System.out.println(a1 == a2);           //sprawdzenie rownosci
        System.out.println(a1 != a2);           // sprawdzenie nierownosci
        System.out.println(true && false);      // operator logiczny AND
        System.out.println(true || false);      // operator logiczny OR
        System.out.println(!(true || false));   // operator logiczny NOT OR
    }
}
