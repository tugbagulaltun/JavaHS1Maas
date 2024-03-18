package com.tugba.entity;

public class Yonetici extends Personel {
   private double bonus;

    public Yonetici(String ad, String soyad, String adres, String telefon, String unvan, int calismaSaati, double saatlikUcret) {
        super(ad, soyad, adres, telefon, unvan, calismaSaati, 500);

    }

    public Yonetici(String ad, String soyad, String unvan) {
        super(ad, soyad, unvan);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double maasHesapla() {
        double yoneticiMaasi = 0;
        if (getSaatlikUcret()>=500){
            yoneticiMaasi= (getSaatlikUcret()*getCalismaSaati())+bonus;
            System.out.println("Yönetici Maaşı...: "+ yoneticiMaasi);
        }else {System.out.println("Yöneticinin Saatlik Ücreti 500'den az olamaz.");
            setSaatlikUcret(500);}
        return yoneticiMaasi;
    }


}
