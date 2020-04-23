package com.company;

import java.util.ArrayList;
import java.util.List;

public class Oppekava {
    private String oppekavaKood;
    private List<Aine> ained = new ArrayList<>();

    public Oppekava(String oppekavaKood) {
        this.oppekavaKood = oppekavaKood;
    }

    public Oppekava(String oppekavaKood, List<Aine> ained) {
        this.oppekavaKood = oppekavaKood;
        this.ained = ained;
    }

    @Override
    public String toString() {
        return "Oppekava{" +
                "oppekavaKood='" + oppekavaKood + '\'' +
                ", ained=" + ained +
                '}';
    }

    public String getOppekavaKood() {
        return oppekavaKood;
    }

    public void setOppekavaKood(String oppekavaKood) {
        this.oppekavaKood = oppekavaKood;
    }

    public List<Aine> getAined() {
        return ained;
    }

    public void setAined(List<Aine> ained) {
        this.ained = ained;
    }

    public void addAine(Aine aine) {
        this.ained.add(aine);
    }

}
