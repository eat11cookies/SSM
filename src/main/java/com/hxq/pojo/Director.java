package com.hxq.pojo;

public class Director {
    private int id;
    private String name;
    private String img;
    private String content;

    public Director(int id, String name, String img, String content) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.content = content;
    }

    public Director() {
    }

    @Override
    public String toString() {
        return "director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", content='" + content + '\'' +
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
