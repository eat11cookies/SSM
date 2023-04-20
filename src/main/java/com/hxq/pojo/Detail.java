package com.hxq.pojo;

public class Detail {
    private int id;
    private String name;
    private String translate;
    private String des1;
    private String des2;
    private String des3;
    private float score;
    private float sum;

    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getDes1() {
        return des1;
    }

    public void setDes1(String des1) {
        this.des1 = des1;
    }

    public String getDes2() {
        return des2;
    }

    public void setDes2(String des2) {
        this.des2 = des2;
    }

    public String getDes3() {
        return des3;
    }

    public void setDes3(String des3) {
        this.des3 = des3;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public Detail(int id, String name, String translate, String des1, String des2, String des3, float score, float sum, String img) {
        this.id = id;
        this.name = name;
        this.translate = translate;
        this.des1 = des1;
        this.des2 = des2;
        this.des3 = des3;
        this.score = score;
        this.sum = sum;
        this.img = img;
    }

    public Detail() {
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", translate='" + translate + '\'' +
                ", des1='" + des1 + '\'' +
                ", des2='" + des2 + '\'' +
                ", des3='" + des3 + '\'' +
                ", score=" + score +
                ", sum=" + sum +
                ", img='" + img + '\'' +
                '}';
    }
}
