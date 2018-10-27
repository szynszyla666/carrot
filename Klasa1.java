public class Klasa1 {
    public static void main(String[] args) {
        int a = 8;
        if (a % 2 ==0){
            System.out.println("jest podzielna");
        } else if (a > 0 && a < 15) {
            System.out.println(a + " nie jest wieksze od 0 i mniejsze od 5");
        } else
        {
            System.out.println("nie jest podzielna");
        }

        switch (a){
            case 1:
                System.out.println(a + " = 1");     // pierwszy warunek: a = 1
                break;                              // wyjście z case i całego switcha
            case 5:
                System.out.println(a + " = 5");       // drugi warunek: a = 5
                break;
            case 7:
                System.out.println(a + " = 5");       // trzeci warunek: a = 5
                break;
                default:
                    System.out.println(a + " = 9");       // domyślny warunek: a = 9
        }

        int b = 0;
        System.out.println("Pętla 1");
        while(b<10){
            System.out.println("b = " + b++);

        }
        System.out.println("Pętla 2");
        b=0;
        do{
            System.out.println("b = " + b++);
        }while(b<10);
    }
}
