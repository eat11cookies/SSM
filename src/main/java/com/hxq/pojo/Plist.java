package com.hxq.pojo;

public class Plist {
    private  int id;
    private String begin;
    private String end;
    private String lang;
    private String halls;
    private Float price;

    public Plist() {
    }

    @Override
    public String toString() {
        return "Plist{" +
                "id=" + id +
                ", begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                ", lang='" + lang + '\'' +
                ", halls='" + halls + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getHalls() {
        return halls;
    }

    public void setHalls(String halls) {
        this.halls = halls;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Plist(int id, String begin, String end, String lang, String halls, Float price) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.lang = lang;
        this.halls = halls;
        this.price = price;
    }
}
