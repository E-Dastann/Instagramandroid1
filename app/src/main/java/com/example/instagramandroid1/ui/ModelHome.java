package com.example.instagramandroid1.ui;

import android.widget.ImageView;
import android.widget.TextView;

public class ModelHome {
    private int imageView;
    private String textViewMore;
    private String  textViewMonth;

    public ModelHome(int imageView, String textViewMore, String textViewMonth) {
        this.imageView = imageView;
        this.textViewMore = textViewMore;
        this.textViewMonth = textViewMonth;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTextViewMore() {
        return textViewMore;
    }

    public void setTextViewMore( String textViewMore) {
        this.textViewMore = textViewMore;
    }

    public String getTextViewMonth() {
        return textViewMonth;
    }

    public void setTextViewMonth(String textViewMonth) {
        this.textViewMonth = textViewMonth;
    }
}
