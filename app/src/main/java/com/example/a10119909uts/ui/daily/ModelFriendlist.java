package com.example.a10119909uts.ui.daily;

public class ModelFriendlist {

    int image;
    String name;

    public ModelFriendlist(int gambar, String nama) {
        this.image = gambar;
        this.name = nama;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return name;
    }

    public void setNama(String nama) {
        this.name = nama;
    }
}
