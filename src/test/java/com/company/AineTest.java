package com.company;

import com.company.Aine;
import org.junit.Test;
import org.junit.Assert;

public class AineTest {
    Aine oop = new Aine("RT-016", "Objektorienteeritud programmeerimine", 5);

    @Test
    public void printsString(){
        System.out.println(oop.toString());
    }

    @Test
    public void returnsHours(){
        int output = oop.tundideArv();
        Assert.assertEquals(output, 40);
    }


}