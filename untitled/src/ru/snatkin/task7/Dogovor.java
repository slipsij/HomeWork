package ru.snatkin.task7;

public class Dogovor {

private  String dogovorNAme;

public Dogovor(String dogovorNAme) {
        this.dogovorNAme = dogovorNAme;
        }

public Dogovor(AKT akt) {
        this.dogovorNAme = akt.getAktName();
        }

public String getDogovorNAme() {
        return dogovorNAme;
        }

public void setDogovorNAme(String dogovorNAme) {
        this.dogovorNAme = dogovorNAme;
        }

    public static void main(String[] args) {
    AKT akt = new AKT("Test");
    Dogovor dogovor = new Dogovor(akt);
        System.out.println(dogovor.getDogovorNAme());
    }
}
