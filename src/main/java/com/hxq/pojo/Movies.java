package com.hxq.pojo;

public class Movies {
    private int id;
    private String name;
    private float score;
    private String version;
    private String img;
    private String time;
    private String dirName;
    private String des;

    public Movies(int id, String name, float score, String version, String img, String time, String dirName, String des) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.version = version;
        this.img = img;
        this.time = time;
        this.dirName = dirName;
        this.des = des;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", version='" + version + '\'' +
                ", img='" + img + '\'' +
                ", time='" + time + '\'' +
                ", dirName='" + dirName + '\'' +
                ", des='" + des + '\'' +
                '}';
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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Movies() {
    }
}
