package com.example.instagramandroid1.heart;

public class ModelLike {
    private int photoOval;
    private int photoSquare;
    private String wordName;

    public ModelLike(int photoOval, int photoSquare, String wordName) {
        this.photoOval = photoOval;
        this.photoSquare = photoSquare;
        this.wordName = wordName;
    }

    public int getPhotoOval() {
        return photoOval;
    }

    public void setPhotoOval(int photoOval) {
        this.photoOval = photoOval;
    }

    public int getPhotoSquare() {
        return photoSquare;
    }

    public void setPhotoSquare(int photoSquare) {
        this.photoSquare = photoSquare;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }


}
