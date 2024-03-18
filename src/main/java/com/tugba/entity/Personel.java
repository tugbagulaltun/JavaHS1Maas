package com.tugba.entity;

import java.util.List;

public abstract class Personel {
    private Long id;
    private String ad;
    private String soyad;
    private String adres;
    private String telefon;
    private String unvan;
    private  int calismaSaati;
    private double saatlikUcret;
    private double anaOdeme;
    private double mesai;

    public Personel(String ad, String soyad, String adres, String telefon, String unvan, int calismaSaati, double saatlikUcret) {
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.telefon = telefon;
        this.unvan = unvan;
        this.calismaSaati = calismaSaati;
        this.saatlikUcret = saatlikUcret;
    }

    public Personel(String ad, String soyad, String unvan) {
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
    }

    public double maasHesapla() {
         double maas = saatlikUcret * calismaSaati;
        return maas;
    }

    public double getAnaOdeme() {
        return anaOdeme;
    }

    public void setAnaOdeme(double anaOdeme) {
        this.anaOdeme = anaOdeme;
    }

    public double getMesai() {
        return mesai;
    }

    public void setMesai(double mesai) {
        this.mesai = mesai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public int getCalismaSaati() {
        return calismaSaati;
    }

    public void setCalismaSaati(int calismaSaati) {
        this.calismaSaati = calismaSaati;
    }

    public double getSaatlikUcret() {
        return saatlikUcret;
    }

    public void setSaatlikUcret(double saatlikUcret) {
        this.saatlikUcret = saatlikUcret;
    }


}
