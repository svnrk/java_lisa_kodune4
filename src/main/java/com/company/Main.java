package com.company;

public class Main {

    public static void main(String[] args) {
        Aine oop = new Aine("RT-016", "Objektorienteeritud programmeerimine", 5);
        Oppekava kava = new Oppekava("RT");


        System.out.println("Nimetus: " + oop.getNimetus());
        System.out.println("Kood: " + oop.getKood());
        System.out.println("EAP: " + oop.getEap());
        System.out.println("Tundide arv: " + oop.tundideArv());
        System.out.println(oop.toString() + "\n");


        System.out.println(kava.toString());
        kava.addAine(oop);
        System.out.println("Kood: " + kava.getOppekavaKood());
        System.out.println("Ained: " + kava.getAined());

        System.out.println(kava.toString());

    }

}
