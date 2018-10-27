public class Klasa_osoby {
    String imie;
    int wiek;
    Boolean jezyk;  //czy zna jezyk obcy
    private Gender gender;


    public String getImie() {
        return imie;
    }
    public int getWiek() {
        return wiek;
    }
    public Boolean getJezyk() {
        return jezyk;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public void setJezyk(Boolean jezyk) {
        this.jezyk = jezyk;
    }

    public Klasa_osoby(String imie, int wiek, Boolean jezyk, Gender gender){
        this.imie=imie;
        this.wiek=wiek;
        this.jezyk=jezyk;
        this.gender=gender;

    }

    @Override   //nadpisanie wartosci domyslnych
    public String toString(){
        return "Person{" +
                "name='" + imie + '\'' +
                ", age='" + wiek + '\'' +
                ", lng='" + jezyk + '\'' +
                ", gender='" + gender + '\'' + "}";
        // przykład: Person{name='Stefan', age='45', lng='false', gender='MALE'}
    }

    @Override
    public boolean equals(Object other){
        Klasa_osoby otherPerson = (Klasa_osoby)other;
        return (this.imie.equals(otherPerson.imie) && this.wiek == otherPerson.wiek && this.jezyk.equals(otherPerson.jezyk) && this.gender == otherPerson.gender);
        // equals dla złożonych - mogą przyjmować różne wartości
        // == dla prymitywnych - można porównywać 1:1 bo przyjmuje z góry zdefiniowane wartości jak np. gender
    }
}
