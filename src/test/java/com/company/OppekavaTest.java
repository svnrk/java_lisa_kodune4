package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppekavaTest {
    Aine oop = new Aine("RT-016", "Objektorienteeritud programmeerimine", 5);
    Oppekava kava = new Oppekava("RT");

    @Test
    void testToString() {
        System.out.println(kava.toString());
        kava.addAine(oop);
        System.out.println(kava.toString());
    }
}