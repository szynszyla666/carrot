import java.util.Random;

public class Dicer {
    //int[] kostka = {1, 2, 3, 4, 5, 6};
    private int iloscKostek;
    private int wynik;

    public Dicer(int iloscKostek) {
        this.iloscKostek=iloscKostek;
    }

    public void rzutKostka(){
        Random r = new Random();

        StringBuilder s = new StringBuilder("{");

        for (int i=0; i < iloscKostek; i++){
            s.append(r.nextInt(6)+1).append(", ");
        }
        s.delete(s.lastIndexOf(","), s.length());
        s.append("}");
        System.out.println(s.toString());
    }

    public static void main(String[] args) {

    }

    //public int getRzut(){
    //    //Math.random();
    //    this.wynik = new Random().nextInt(6)+1;
    //    //System.out.println(wynik);
    //    return wynik;
    //}

    //public Dicer(int wynik) {
    //    this.wynik = wynik;
    //}



}
