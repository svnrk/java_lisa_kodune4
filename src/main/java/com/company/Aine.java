package com.company;

public class Aine {
    private String kood;
    private String nimetus;
    private Integer eap;

    public Aine(String kood, String nimetus, Integer eap) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.eap = eap;
    }

    @Override
    public String toString() {
        return "Aine{" +
                "kood='" + kood + '\'' +
                ", nimetus='" + nimetus + '\'' +
                ", eap=" + eap +
                '}';
    }

    public String getKood() {
        return kood;
    }

    public void setKood(String kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public Integer getEap() {
        return eap;
    }

    public void setEap(Integer eap) {
        this.eap = eap;
    }

    public Integer tundideArv(){
        return eap * 8;
    }
}
