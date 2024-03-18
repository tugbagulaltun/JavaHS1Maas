package com.tugba.entity;

public class Memur extends  Personel {
    private int derece;

    public Memur(String ad, String soyad, String adres, String telefon, String unvan, int calismaSaati, double saatlikUcret, int derece) {
        super(ad, soyad, adres, telefon, unvan, calismaSaati, 500);
        this.derece=derece;
    }

    public Memur(String ad, String soyad, String unvan) {
        super(ad, soyad, unvan);
    }


    @Override
    public double maasHesapla() {
        double memurMaasi = 0;
        if (getSaatlikUcret()<180){
            memurMaasi= memurDerecesi();
        } else if (getSaatlikUcret()>=180) {
            memurMaasi= memurDerecesi()*1.5;
        } else System.out.println("Hata Oluştu.");
        return memurMaasi;
    }

    public double memurDerecesi(){
        double saatlikUcret= this.getSaatlikUcret();
        switch (derece){
            case 1: saatlikUcret=500; break;
            case 2: saatlikUcret=700; break;
            case 3: saatlikUcret=900; break;
        }
        return saatlikUcret*getCalismaSaati();
    }
    public int getDerece() {
        return derece;
    }

    public void setDerece(int derece) {
        this.derece = derece;
    }
}

