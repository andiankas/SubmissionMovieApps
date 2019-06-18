package com.example.submissionmovieapps;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String name, remarks, photo, content, rilis, direct, durasi, tahun, genre;

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getRilis() { return rilis; }
    public void setRilis(String rilis) { this.rilis = rilis; }

    public String getDirect() { return direct; }
    public void setDirect(String direct) { this.direct = direct; }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDurasi() {
        return durasi;
    }
    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getTahun() {
        return durasi;
    }
    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.content);
        dest.writeString(this.rilis);
        dest.writeString(this.direct);
        dest.writeString(this.durasi);
        dest.writeString(this.tahun);
        dest.writeString(this.genre);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.content = in.readString();
        this.rilis = in.readString();
        this.direct = in.readString();
        this.durasi = in.readString();
        this.tahun = in.readString();
        this.genre = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }
        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

}
