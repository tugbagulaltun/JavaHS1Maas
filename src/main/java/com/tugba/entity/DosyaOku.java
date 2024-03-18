package com.tugba.entity;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import static com.tugba.utility.PersonelDB.personelList;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class DosyaOku {
    public void jsonOkuma() throws FileNotFoundException {
        JsonParser parser = new JsonParser();

        try {
            Object obj = parser.parse(new FileReader("C:\\Users\\planlama04\\Java_Deneme\\Case2\\src\\main\\resources\\YoneticiVeMemurListesi.json"));
            JsonArray array = (JsonArray) obj;

            for (Object o : array) {
                JsonObject personel = (JsonObject) o;

                String ad = personel.get("Ad").getAsString();
                System.out.println(ad);

                String soyad = personel.get("Soyad").getAsString();
                System.out.println(soyad);

                String unvan = personel.get("Unvan").getAsString().toUpperCase();
                System.out.println(unvan);


                if (unvan.equalsIgnoreCase("Yonetici")) {
                    personelList.add(new Yonetici(ad, soyad, unvan));
                } else if (unvan.equalsIgnoreCase("Memur")) {
                    personelList.add(new Memur(ad, soyad, unvan));
                }
            }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
