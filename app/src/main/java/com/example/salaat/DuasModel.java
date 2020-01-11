package com.example.salaat;

public class DuasModel {
    private String Dua_Name;
    private int Dua_Photo;
    private String Dua_Arabic;
    private String Dua_Translation;
    private String Dua_Reference;

    public DuasModel(String dua_Name, int dua_Photo, String dua_Arabic, String dua_Translation, String dua_Reference) {
        Dua_Name = dua_Name;
        Dua_Photo = dua_Photo;
        Dua_Arabic = dua_Arabic;
        Dua_Translation = dua_Translation;
        Dua_Reference = dua_Reference;
    }

    public String getDua_Name() {
        return Dua_Name;
    }

    public void setDua_Name(String dua_Name) {
        Dua_Name = dua_Name;
    }

    public int getDua_Photo() {
        return Dua_Photo;
    }

    public void setDua_Photo(int dua_Photo) {
        Dua_Photo = dua_Photo;
    }

    public String getDua_Arabic() {
        return Dua_Arabic;
    }

    public void setDua_Arabic(String dua_Arabic) {
        Dua_Arabic = dua_Arabic;
    }

    public String getDua_Translation() {
        return Dua_Translation;
    }

    public void setDua_Translation(String dua_Translation) {
        Dua_Translation = dua_Translation;
    }

    public String getDua_Reference() {
        return Dua_Reference;
    }

    public void setDua_Reference(String dua_Reference) {
        Dua_Reference = dua_Reference;
    }
}
