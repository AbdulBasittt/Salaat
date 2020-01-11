package com.example.salaat;

public class M_NamesModel {
    private String Name;
    private String Disc;
    private int Photo;
    private String UrduName;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDisc() {
        return Disc;
    }

    public void setDisc(String disc) {
        Disc = disc;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    public String getUrduName() {
        return UrduName;
    }

    public void setUrduName(String urduName) {
        UrduName = urduName;
    }

    public M_NamesModel(String name, String disc, int photo, String urduName) {

        Name = name;
        Disc = disc;
        Photo = photo;
        UrduName = urduName;
    }
}
