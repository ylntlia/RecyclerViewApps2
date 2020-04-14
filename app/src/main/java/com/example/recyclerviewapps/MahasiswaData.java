package com.example.recyclerviewapp;

import java.util.ArrayList;

public class MahasiswaData {
    private static String[] mahasiswaNama = {
            "Yulianti",
            "Wiwin Winarti",
            "Mega Restu Mirantika",
            "Gunawan",
            "Virdyawan Eka Prayoga",
    };

    private static String[] mahasiswaNim = {
            "311710291",
            "311710465",
            "311710112",
            "311710426",
            "311710496",
    };

    private static String[] mahasiswaHp = {
            "0813-5997-2755",
            "0838-6767-1200",
            "0858-9087-8900",
            "0812-5665-8432",
            "0878-4771-0098",
    };

    private static int[] mahasiswaImage = {
            R.drawable.yulianti,
            R.drawable.wiwinwinarti,
            R.drawable.mega,
            R.drawable.gun,
            R.drawable.virdyawan
    };

    static ArrayList<com.example.recyclerviewapp.Mahasiswa> getListData() {
        ArrayList<com.example.recyclerviewapp.Mahasiswa> list = new ArrayList<>();
        for (int position =0; position < mahasiswaNama.length; position++) {
            com.example.recyclerviewapp.Mahasiswa mahasiswa = new com.example.recyclerviewapp.Mahasiswa();
            mahasiswa.setNama(mahasiswaNama[position]);
            mahasiswa.setNim(mahasiswaNim[position]);
            mahasiswa.setPhoto(mahasiswaImage[position]);
            mahasiswa.setNoHp(mahasiswaHp[position]);
            list.add(mahasiswa);
        }
        return list;
    }
}