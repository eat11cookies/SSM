package com.hxq.pojo;

public class Advance {
    private String name;
    private String img;
    private int sum;
    private String time;

    public Advance() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Advance(String name, String img, int sum, String time) {
        this.name = name;
        this.img = img;
        this.sum = sum;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Advance{" +
                "name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", sum=" + sum +
                ", time='" + time + '\'' +
                '}';
    }
}
