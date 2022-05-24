package com.example.a10119909uts.ui.favourite;

public class ModelFavourite {
    int image;
    String title;
    String singer;

    public ModelFavourite(int image, String title, String singer) {
        this.image = image;
        this.title = title;
        this.singer = singer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPenyanyi() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
