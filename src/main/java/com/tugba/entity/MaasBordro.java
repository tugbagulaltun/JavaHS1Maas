package com.tugba.entity;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MaasBordro {
    private Personel personel;
    private List<Personel> onSaattenAzCalisanPersonelListesi;

    public List<Personel> onSaattenAzCalisanPersonelListesi() {
        if (personel.getCalismaSaati() < 10) {
            onSaattenAzCalisanPersonelListesi.add(personel);
        }
        return onSaattenAzCalisanPersonelListesi;
    }
    public void maasBordro() {
        try {
            Gson gson = new Gson();
            BufferedWriter bf = new BufferedWriter(new FileWriter("MemurBordro.json"));
            if (personel.getUnvan().toUpperCase().equalsIgnoreCase("Memur")) {
                Memur memurPersonel = new Memur(personel.getAd(), personel.getSoyad(),personel.getAdres(),personel.getTelefon(), personel.getUnvan(), personel.getCalismaSaati(), personel.getSaatlikUcret(), personel.getCalismaSaati());
                System.out.println("Maaş Bordro," + "SUBAT" + "2024");
                System.out.println("---------------------------------------------");
                System.out.println("Personel Adı: " + personel.getAd());
                System.out.println("Çalışma Saati: " + personel.getCalismaSaati());
                System.out.println("Mesai: " + personel.getMesai());
                System.out.println("---------------------------------------------");
                System.out.println("Toplam Ödeme: " + personel.getAnaOdeme()+personel.getMesai());


                gson.toJson(memurPersonel, bf);
                bf.flush();
            } else if (personel.getUnvan().toUpperCase().equalsIgnoreCase("Yonetici")) {
                Yonetici yoneticiPersonel = new Yonetici
                        (personel.getAd(), personel.getSoyad(),personel.getAdres(),personel.getTelefon(), personel.getUnvan(), personel.getCalismaSaati(), personel.getSaatlikUcret());
                System.out.println("Maaş Bordro," + "SUBAT" + "2024");
                System.out.println("---------------------------------------------");
                System.out.println("Personel İsmi:" + personel.getAd());
                System.out.println("Çalışma Saati:" + personel.getCalismaSaati());
                System.out.println("Ana Ödeme:" + personel.getAnaOdeme());
                System.out.println("Mesai:" + personel.getMesai());
                System.out.println("---------------------------------------------");
                System.out.println("Toplam Ödeme:" + personel.getAnaOdeme()+personel.getMesai());


                gson.toJson(yoneticiPersonel, bf);
                bf.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
